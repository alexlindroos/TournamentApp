package com.example.codemate.tournamentorganizer.app.navigator

import android.content.Intent
import com.example.codemate.tournamentorganizer.app.ui.addresult.activity.AddResultActivity
import com.example.codemate.tournamentorganizer.app.ui.home.activity.HomeActivity
import com.example.codemate.tournamentorganizer.app.ui.menu.activity.MenuActivity
import com.example.codemate.tournamentorganizer.app.ui.options.activity.OptionsActivity
import com.example.codemate.tournamentorganizer.app.ui.scoreboard.activity.ScoreBoardActivity
import com.example.codemate.tournamentorganizer.app.ui.splash.activity.SplashActivity
import com.example.codemate.tournamentorganizer.app.ui.teampicker.activity.TeamPickerActivity
import com.example.codemate.tournamentorganizer.app.ui.tournamentcreator.activity.TournamentCreatorActivity
import com.example.codemate.tournamentorganizer.ui.fixture.activity.FixtureActivity
import com.example.codemate.tournamentorganizer.ui.home.base.BaseActivity

/**
 * Created by Alex Lindroos on 21/06/2017.
 */

class Navigator {

    var currentActivity: BaseActivity? = null

    private fun toDefaultActivity(activity: Class<*>) {
        val intent = Intent(currentActivity, activity)
        currentActivity?.startActivity(intent)
    }

    private fun toDefaultActivityForResult(requestCode: Int, activity: Class<*>) {
        val intent = Intent(currentActivity, activity)
        currentActivity?.startActivityForResult(intent, requestCode)
    }

    private fun toDefaultActivityCleaningStack(activity: Class<*>) {
        val intent = Intent(currentActivity, activity)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        currentActivity?.startActivity(intent)
    }


    fun toHome() {
        toDefaultActivityCleaningStack(HomeActivity::class.java)
    }

    fun toTournamentCreator() {
        toDefaultActivity(TournamentCreatorActivity::class.java)
    }

    fun toOptions() {
        toDefaultActivity(OptionsActivity::class.java)
    }

    fun toSplash() {
        toDefaultActivity(SplashActivity::class.java)
    }

    fun toAddResult() {
        toDefaultActivity(AddResultActivity::class.java)
    }

    fun toTeamPicker() {
      toDefaultActivity(TeamPickerActivity::class.java)
    }

    fun toScoreBoard() {
        toDefaultActivity(ScoreBoardActivity::class.java)
    }

    fun toMenu() {
        toDefaultActivityCleaningStack(MenuActivity::class.java)
    }

    fun toFixtures() {
        toDefaultActivity(FixtureActivity::class.java)
    }

    fun finishActivity() {
        currentActivity?.finish()
    }
}