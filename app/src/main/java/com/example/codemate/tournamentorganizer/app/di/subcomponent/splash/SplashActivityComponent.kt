package com.example.codemate.tournamentorganizer.app.di.subcomponent.splash

import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.ui.splash.activity.SplashActivity
import dagger.Subcomponent

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(
        SplashActivityModule::class
))
interface SplashActivityComponent {
    fun injectTo(activity: SplashActivity)
}