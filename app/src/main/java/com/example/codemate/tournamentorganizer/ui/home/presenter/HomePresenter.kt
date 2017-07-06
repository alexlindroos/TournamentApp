package com.example.codemate.tournamentorganizer.app.ui.home.presenter

import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.base.BasePresenter
import com.example.codemate.tournamentorganizer.app.ui.home.activity.HomeView

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
class HomePresenter(view: HomeView,val navigator: Navigator) : HomeView, BasePresenter<HomeView>() {

    fun navigateToTournamentCreator() = navigator.toTournamentCreator()

    fun navigateToOptions() = navigator.toOptions()

}
