package com.example.codemate.tournamentorganizer.app.ui.splash.presenter

import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import com.example.codemate.tournamentorganizer.app.ui.splash.activity.SplashView

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
class SplashPresenter(val view: SplashView, val navigator: Navigator) {

    fun navigateToHome() {
        navigator.toHome()
    }

}
