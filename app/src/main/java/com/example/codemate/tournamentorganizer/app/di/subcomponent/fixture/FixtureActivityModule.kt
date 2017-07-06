package com.example.codemate.tournamentorganizer.app.di.subcomponent.fixture

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.ui.fixture.activity.FixtureActivity
import com.example.codemate.tournamentorganizer.ui.fixture.activity.FixtureView
import com.example.codemate.tournamentorganizer.ui.fixture.presenter.FixturePresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 06/07/2017.
 */
@Module
class FixtureActivityModule(activity: FixtureActivity) : ActivityModule(activity) {
    @Provides
    @ActivityScope
    fun provideFixtureView(): FixtureView = activity as FixtureView

    @Provides
    @ActivityScope
    fun provideFixturePresenter(view: FixtureView, navigator: Navigator) = FixturePresenter(view,navigator)
}