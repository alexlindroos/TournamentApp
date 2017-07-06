package com.example.codemate.tournamentorganizer.app.ui.home.activity

import android.os.Bundle
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.home.HomeActivityModule
import com.example.codemate.tournamentorganizer.app.ui.home.presenter.HomePresenter
import com.example.codemate.tournamentorganizer.ui.home.base.BaseActivity
import kotlinx.android.synthetic.main.activity_home.*
import javax.inject.Inject

/**
 * Created by Alex Lindroos on 21/06/2017.
 */

class HomeActivity : BaseActivity(), HomeView{

    @Inject
    lateinit var presenter: HomePresenter

    override var layoutId: Int = R.layout.activity_home

    override fun setupInjection(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(HomeActivityModule(this))
                .injectTo(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupButtonListeners()
    }

    override fun attachPresenter() {
        presenter.attachView(this)
    }

    override fun detachPresenter() {
        presenter.detachView()
    }

    fun setupButtonListeners() {
        btn_createNewTournament.setOnClickListener {
            presenter.navigateToTournamentCreator()
        }

        btn_options.setOnClickListener {
            presenter.navigateToOptions()
        }
    }


}