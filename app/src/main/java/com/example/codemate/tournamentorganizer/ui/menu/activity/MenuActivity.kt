package com.example.codemate.tournamentorganizer.app.ui.menu.activity

import android.os.Bundle
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.menu.MenuActivityModule
import com.example.codemate.tournamentorganizer.app.ui.menu.presenter.MenuPresenter
import com.example.codemate.tournamentorganizer.ui.home.base.BaseActivity
import kotlinx.android.synthetic.main.activity_menu.*
import javax.inject.Inject

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

class MenuActivity : BaseActivity(), MenusView {

    @Inject
    lateinit var presenter : MenuPresenter
    override var layoutId: Int = R.layout.activity_menu

    override fun setupInjection(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(MenuActivityModule(this))
                .injectTo(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btn_fixtures.setOnClickListener { navigator.toFixtures() }
        btn_scoreboard.setOnClickListener { navigator.toScoreBoard() }
    }

    override fun attachPresenter() {
        presenter.attachView(this)
    }

    override fun detachPresenter() {
        presenter.detachView()
    }

    override fun onBackPressed() {
        finish()
    }
}