package com.example.codemate.tournamentorganizer.app.di.subcomponent.scoreboard

import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.ui.scoreboard.activity.ScoreBoardActivity
import dagger.Subcomponent

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

@ActivityScope
@Subcomponent(modules = arrayOf(
        ScoreBoardActivityModule::class
))
interface ScoreBoardActivityComponent {
    fun injectTo(activity: ScoreBoardActivity)
}