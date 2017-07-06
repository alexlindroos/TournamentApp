package com.example.codemate.tournamentorganizer.app.di.subcomponent.tournamentcreator

import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.ui.tournamentcreator.activity.TournamentCreatorActivity
import dagger.Subcomponent

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(
        TournamentCreatorActivityModule::class
))
interface TournamentCreatorActivityComponent {
    fun injectTo(activity: TournamentCreatorActivity)
}