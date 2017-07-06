package com.example.codemate.tournamentorganizer.app.di.subcomponent.splash

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.splash.activity.SplashActivity
import com.example.codemate.tournamentorganizer.app.ui.splash.activity.SplashView
import com.example.codemate.tournamentorganizer.app.ui.splash.presenter.SplashPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@Module
class SplashActivityModule(activity: SplashActivity) : ActivityModule(activity) {
    @Provides
    @ActivityScope
    fun provideSplashView(): SplashView = activity as SplashView

    @Provides
    @ActivityScope
    fun provideSplashPresenter(view: SplashView, navigator: Navigator) = SplashPresenter(view,navigator)
}