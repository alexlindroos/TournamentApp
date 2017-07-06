package com.example.codemate.tournamentorganizer.app.di.subcomponent.scoreboard

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.scoreboard.activity.ScoreBoardActivity
import com.example.codemate.tournamentorganizer.app.ui.scoreboard.activity.ScoreBoardView
import com.example.codemate.tournamentorganizer.app.ui.scoreboard.presenter.ScoreBoardPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

@Module
class ScoreBoardActivityModule(activity: ScoreBoardActivity) : ActivityModule(activity) {
    @Provides
    @ActivityScope
    fun provideScoreBoardView(): ScoreBoardView = activity as ScoreBoardView

    @Provides
    @ActivityScope
    fun provideScoreBoardPresenter(view: ScoreBoardView, navigator: Navigator) = ScoreBoardPresenter(view,navigator)
}