package com.example.codemate.tournamentorganizer.app.ui.teampicker.activity

import android.os.Bundle
import android.support.v7.recyclerview.R.attr.layoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.teampicker.TeamPickerActivityModule
import com.example.codemate.tournamentorganizer.app.ui.teampicker.adapter.TeamPickerAdapter
import com.example.codemate.tournamentorganizer.app.ui.teampicker.presenter.TeamPickerPresenter
import com.example.codemate.tournamentorganizer.ui.home.base.BaseActivity
import kotlinx.android.synthetic.main.activity_teampicker.*
import kotlinx.android.synthetic.main.row_teampicker.*
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

class TeamPickerActivity : BaseActivity(), TeamPickerView {

    @Inject
    lateinit var presenter: TeamPickerPresenter
    lateinit var adapter: TeamPickerAdapter
    override var layoutId: Int = R.layout.activity_teampicker


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rv_teampicker.layoutManager = LinearLayoutManager(this)
        rv_teampicker.setHasFixedSize(true)
        val listAdapter = TeamPickerAdapter()
        adapter = listAdapter
        rv_teampicker.adapter = adapter
    }

    override fun attachPresenter() {
        presenter.attachView(this)
    }

    override fun detachPresenter() {
        presenter.detachView()
    }

    override fun setupInjection(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(TeamPickerActivityModule(this))
                .injectTo(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_done,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.action_menu_done ->
                if(input_teamName.text.isEmpty()) {
                    toast("Please fill player informations")
                    false
                }else{
                    navigator.toMenu()
                    true
            }
            android.R.id.home -> finish()
        }
        return true
    }

}