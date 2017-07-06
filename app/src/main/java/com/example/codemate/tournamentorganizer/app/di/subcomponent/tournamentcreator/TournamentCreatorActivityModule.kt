package com.example.codemate.tournamentorganizer.app.di.subcomponent.tournamentcreator

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.tournamentcreator.activity.TournamentCreatorActivity
import com.example.codemate.tournamentorganizer.app.ui.tournamentcreator.activity.TournamentCreatorView
import com.example.codemate.tournamentorganizer.app.ui.tournamentcreator.presenter.TournamentCreatorPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@Module
class TournamentCreatorActivityModule(activity: TournamentCreatorActivity) : ActivityModule(activity) {
    @Provides
    @ActivityScope
    fun provideTournamentCreatorView(): TournamentCreatorView = activity as TournamentCreatorView

    @Provides
    @ActivityScope
    fun provideTournamentCreatorPresenter(view: TournamentCreatorView, navigator: Navigator) = TournamentCreatorPresenter(view,navigator)
}