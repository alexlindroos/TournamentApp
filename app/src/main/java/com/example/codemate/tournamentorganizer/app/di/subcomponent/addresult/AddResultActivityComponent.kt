package com.example.codemate.tournamentorganizer.app.di.subcomponent.addresult

import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.ui.addresult.activity.AddResultActivity
import dagger.Subcomponent

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

@ActivityScope
@Subcomponent(modules = arrayOf(
        AddResultActivityModule::class
))
interface AddResultActivityComponent {
    fun injectTo(activity: AddResultActivity)
}