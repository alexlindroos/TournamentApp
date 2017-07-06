package com.example.codemate.tournamentorganizer.app.ui.base

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
abstract class BasePresenter<T: PresentationView> {

    private var presentationView: T? = null

    open fun attachView(presentationView: T) {
        this.presentationView = presentationView
    }

    open fun detachView() {
        presentationView = null
    }

    fun isViewAttached(): Boolean {
        return presentationView != null
    }
}