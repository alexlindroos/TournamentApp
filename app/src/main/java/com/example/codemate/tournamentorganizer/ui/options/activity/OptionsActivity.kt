package com.example.codemate.tournamentorganizer.app.ui.options.activity

import android.os.Bundle
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.options.OptionsActivityModule
import com.example.codemate.tournamentorganizer.app.ui.options.presenter.OptionsPresenter
import com.example.codemate.tournamentorganizer.ui.home.base.BaseActivity
import javax.inject.Inject

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
class OptionsActivity : BaseActivity(), OptionsView {

    @Inject
    lateinit var presenter: OptionsPresenter

    override var layoutId: Int = R.layout.activity_options

    override fun setupInjection(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(OptionsActivityModule(this))
                .injectTo(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun attachPresenter() {
        presenter.attachView(this)
    }

    override fun detachPresenter() {
        presenter.detachView()
    }
}