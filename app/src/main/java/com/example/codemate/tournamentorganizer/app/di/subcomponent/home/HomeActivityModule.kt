package com.example.codemate.tournamentorganizer.app.di.subcomponent.home

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.home.activity.HomeActivity
import com.example.codemate.tournamentorganizer.app.ui.home.activity.HomeView
import com.example.codemate.tournamentorganizer.app.ui.home.presenter.HomePresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 21/06/2017.
 */

@Module
class HomeActivityModule(activity: HomeActivity) : ActivityModule(activity) {
    @Provides
    @ActivityScope
    fun provideHomeView(): HomeView = activity as HomeView

    @Provides
    @ActivityScope
    fun provideHomePresenter(view: HomeView, navigator: Navigator) = HomePresenter(view,navigator)
}