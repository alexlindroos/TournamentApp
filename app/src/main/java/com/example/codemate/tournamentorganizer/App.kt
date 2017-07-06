package com.example.codemate.tournamentorganizer

import android.app.Application
import android.os.Bundle
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.component.DaggerApplicationComponent
import com.example.codemate.tournamentorganizer.app.di.module.ApplicationModule

/**
 * Created by Alex Lindroos on 21/06/2017.
 */

class App : Application() {

    companion object {
        lateinit var graph: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    fun initializeDagger() {
        graph = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}