package com.example.codemate.tournamentorganizer.app.di.subcomponent.menu

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.menu.activity.MenuActivity
import com.example.codemate.tournamentorganizer.app.ui.menu.activity.MenusView
import com.example.codemate.tournamentorganizer.app.ui.menu.presenter.MenuPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 27/06/2017.
 */

@Module
class MenuActivityModule(activity: MenuActivity) : ActivityModule(activity) {
    @Provides
    @ActivityScope
    fun provideMenuView(): MenusView = activity as MenusView

    @Provides
    @ActivityScope
    fun provideMenuPresenter(view: MenusView, navigator: Navigator) = MenuPresenter(view,navigator)
}