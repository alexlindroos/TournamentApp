package com.example.codemate.tournamentorganizer.app.di.subcomponent.menu

import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.ui.menu.activity.MenuActivity
import dagger.Subcomponent

/**
 * Created by Alex Lindroos on 27/06/2017.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(
        MenuActivityModule::class
))
interface MenuActivityComponent {
    fun injectTo(activity: MenuActivity)
}