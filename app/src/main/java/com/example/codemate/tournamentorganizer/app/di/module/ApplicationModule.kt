package com.example.codemate.tournamentorganizer.app.di.module

import android.content.Context
import com.example.codemate.tournamentorganizer.App
import com.example.codemate.tournamentorganizer.app.di.qualifier.ApplicationQualifier
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@Module
class ApplicationModule(private val app: App) {

    @Provides @Singleton
    fun provideApplication(): App = app

    @Provides @Singleton @ApplicationQualifier
    fun provideApplicationContext(): Context = app

    @Provides @Singleton
    fun provideNavigator(): Navigator = Navigator()

}