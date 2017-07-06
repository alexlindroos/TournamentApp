package com.example.codemate.tournamentorganizer.app.ui.base.extension

import android.view.View

/**
 * Created by Alex Lindroos on 21/06/2017.
 */

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}