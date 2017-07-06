package com.example.codemate.tournamentorganizer.ui.fixture.activity

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.MenuItem
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.fixture.FixtureActivityModule
import com.example.codemate.tournamentorganizer.ui.fixture.adapter.FixtureAdapter
import com.example.codemate.tournamentorganizer.ui.fixture.presenter.FixturePresenter
import com.example.codemate.tournamentorganizer.ui.home.base.BaseActivity
import kotlinx.android.synthetic.main.activity_fixtures.*
import javax.inject.Inject

/**
 * Created by Alex Lindroos on 06/07/2017.
 */
class FixtureActivity: BaseActivity(), FixtureView {

    @Inject
    lateinit var presenter: FixturePresenter
    lateinit var adapter: FixtureAdapter
    override var layoutId: Int = R.layout.activity_fixtures

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rv_fixtures.layoutManager = LinearLayoutManager(this)
        rv_fixtures.setHasFixedSize(true)
        val listAdapter = FixtureAdapter()
        adapter = listAdapter
        rv_fixtures.adapter = adapter
    }

    override fun attachPresenter() {
        presenter.attachView(this)
    }

    override fun detachPresenter() {
        presenter.detachView()
    }

    override fun setupInjection(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(FixtureActivityModule(this))
                .injectTo(this)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return true
    }
}