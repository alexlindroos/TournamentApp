package com.example.codemate.tournamentorganizer.app.ui.scoreboard.activity

import android.os.Bundle
import android.view.MenuItem
import android.widget.TableRow
import android.widget.TextView
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.scoreboard.ScoreBoardActivityModule
import com.example.codemate.tournamentorganizer.app.ui.scoreboard.presenter.ScoreBoardPresenter
import com.example.codemate.tournamentorganizer.ui.home.base.BaseActivity
import kotlinx.android.synthetic.main.activity_tournament_scoreboard.*
import javax.inject.Inject

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

class ScoreBoardActivity : BaseActivity(), ScoreBoardView {

    @Inject
    lateinit var presenter: ScoreBoardPresenter
    override var layoutId: Int = R.layout.activity_tournament_scoreboard


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addRow()
        addRow()
        addRow()
    }

    override fun attachPresenter() {
        presenter.attachView(this)
    }

    override fun detachPresenter() {
        presenter.detachView()
    }

    override fun setupInjection(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(ScoreBoardActivityModule(this))
                .injectTo(this)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> presenter.navigator.toMenu()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        finish()
    }

    fun addRow() {

        val row = TableRow(this)
        val lp = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        row.layoutParams = lp
        val txt_team = TextView(this)
        val txt_games = TextView(this)
        val txt_wins = TextView(this)
        val txt_draws = TextView(this)
        val txt_loss = TextView(this)
        val txt_goals = TextView(this)
        val txt_points = TextView(this)

        txt_team.text = "123456789a"
        txt_games.text = "5"
        txt_wins.text = "4"
        txt_draws.text = "1"
        txt_loss.text = "0"
        txt_goals.text = "14"
        txt_points.text = "13"

        row.addView(txt_team)
        row.addView(txt_games)
        row.addView(txt_wins)
        row.addView(txt_draws)
        row.addView(txt_loss)
        row.addView(txt_goals)
        row.addView(txt_points)
        row.setPadding(30,0,0,0)

        table_scoreboard.addView(row)
    }

}
