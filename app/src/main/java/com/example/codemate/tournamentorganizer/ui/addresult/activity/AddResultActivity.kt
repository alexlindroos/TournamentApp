package com.example.codemate.tournamentorganizer.app.ui.addresult.activity

import android.os.Bundle
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.addresult.AddResultActivityModule
import com.example.codemate.tournamentorganizer.app.ui.addresult.presenter.AddResultPresenter
import com.example.codemate.tournamentorganizer.ui.home.base.BaseActivity
import javax.inject.Inject

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

class AddResultActivity : BaseActivity(), AddResultView {

    @Inject
    lateinit var presenter: AddResultPresenter
    override var layoutId: Int = R.layout.activity_add_result

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun attachPresenter() {
        presenter.attachView(this)
    }

    override fun detachPresenter() {
        presenter.detachView()
    }

    override fun setupInjection(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(AddResultActivityModule(this))
                .injectTo(this)
    }

}