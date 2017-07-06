package com.example.codemate.tournamentorganizer.app.di.subcomponent.options

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.options.activity.OptionsActivity
import com.example.codemate.tournamentorganizer.app.ui.options.activity.OptionsView
import com.example.codemate.tournamentorganizer.app.ui.options.presenter.OptionsPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@Module
class OptionsActivityModule(activity: OptionsActivity) : ActivityModule(activity) {
    @Provides
    @ActivityScope
    fun provideOptionsView(): OptionsView = activity as OptionsView

    @Provides
    @ActivityScope
    fun provideOptionsPresenter(view: OptionsView, navigator: Navigator) = OptionsPresenter(view,navigator)
}