package com.example.codemate.tournamentorganizer.app.di.subcomponent.fixture

import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.ui.fixture.activity.FixtureActivity
import com.example.codemate.tournamentorganizer.ui.fixture.adapter.FixtureAdapter
import dagger.Subcomponent

/**
 * Created by Alex Lindroos on 06/07/2017.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(
        FixtureActivityModule::class
))
interface FixtureActivityComponent {
    fun injectTo(activity: FixtureActivity)
}