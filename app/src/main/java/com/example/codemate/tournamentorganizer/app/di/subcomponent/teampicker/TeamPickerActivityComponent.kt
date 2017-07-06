package com.example.codemate.tournamentorganizer.app.di.subcomponent.teampicker

import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.ui.teampicker.activity.TeamPickerActivity
import dagger.Subcomponent

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

@ActivityScope
@Subcomponent(modules = arrayOf(
        TeamPickerActivityModule::class
))
interface TeamPickerActivityComponent {
    fun injectTo(activity: TeamPickerActivity)
}