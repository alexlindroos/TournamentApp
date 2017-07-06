package com.example.codemate.tournamentorganizer.app.di.subcomponent.home

import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.ui.home.activity.HomeActivity
import dagger.Subcomponent

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(
        HomeActivityModule::class
))
interface HomeActivityComponent {
    fun injectTo(activity: HomeActivity)
}