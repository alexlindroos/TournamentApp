package com.example.codemate.tournamentorganizer.app.ui.tournamentcreator.activity

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.NumberPicker
import android.widget.Toast
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.tournamentcreator.TournamentCreatorActivityModule
import com.example.codemate.tournamentorganizer.app.ui.tournamentcreator.presenter.TournamentCreatorPresenter
import com.example.codemate.tournamentorganizer.ui.home.base.BaseActivity
import kotlinx.android.synthetic.main.activity_tournamentcreator.*
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
class TournamentCreatorActivity : BaseActivity(), TournamentCreatorView, NumberPicker.OnValueChangeListener{

    @Inject
    lateinit var presenter: TournamentCreatorPresenter

    override var layoutId: Int = R.layout.activity_tournamentcreator

    override fun setupInjection(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(TournamentCreatorActivityModule(this))
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_next, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        when (item.itemId) {
            android.R.id.home -> finish()
            R.id.action_menu_next ->
                if (input_tournamentName.text.toString() == "") {
                    toast("Enter tournament name to continue")
                    false
                } else {
                    //TODO Save to DB
                    val tournamentName = input_tournamentName.text
                    val numberOfPlayers = picker.value
                    presenter.navigator.toTeamPicker()
                    true

                }
        }
        return true
    }

    override fun onValueChange(p0: NumberPicker, p1: Int, p2: Int) {
       Log.d("PICKER", "Value changed")
    }

}