package com.example.codemate.tournamentorganizer.app.di.subcomponent.options

import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.ui.options.activity.OptionsActivity
import dagger.Subcomponent

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(
        OptionsActivityModule::class
))
interface OptionsActivityComponent {
    fun injectTo(activity: OptionsActivity)
}