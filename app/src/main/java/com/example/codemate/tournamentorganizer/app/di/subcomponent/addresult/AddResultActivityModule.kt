package com.example.codemate.tournamentorganizer.app.di.subcomponent.addresult

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.addresult.activity.AddResultActivity
import com.example.codemate.tournamentorganizer.app.ui.addresult.activity.AddResultView
import com.example.codemate.tournamentorganizer.app.ui.addresult.presenter.AddResultPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

@Module
class AddResultActivityModule(activity: AddResultActivity) : ActivityModule(activity) {
    @Provides
    @ActivityScope
    fun provideAddResultView(): AddResultView = activity as AddResultView

    @Provides
    @ActivityScope
    fun provideAddResultPresenter(view: AddResultView, navigator: Navigator) = AddResultPresenter(view,navigator)
}