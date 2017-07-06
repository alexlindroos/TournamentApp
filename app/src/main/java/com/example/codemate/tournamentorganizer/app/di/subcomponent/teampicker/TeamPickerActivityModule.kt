package com.example.codemate.tournamentorganizer.app.di.subcomponent.teampicker

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.teampicker.activity.TeamPickerActivity
import com.example.codemate.tournamentorganizer.app.ui.teampicker.activity.TeamPickerView
import com.example.codemate.tournamentorganizer.app.ui.teampicker.presenter.TeamPickerPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

@Module
class TeamPickerActivityModule(activity: TeamPickerActivity) : ActivityModule(activity) {
    @Provides
    @ActivityScope
    fun provideTeamPickerView(): TeamPickerView = activity as TeamPickerView

    @Provides
    @ActivityScope
    fun provideTeamPickerPresenter(view: TeamPickerView, navigator: Navigator) = TeamPickerPresenter(view,navigator)
}