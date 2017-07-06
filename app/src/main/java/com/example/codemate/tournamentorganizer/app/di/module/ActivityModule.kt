package com.example.codemate.tournamentorganizer.app.di.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.example.codemate.tournamentorganizer.app.di.scope.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@Module
abstract class ActivityModule(protected val activity: AppCompatActivity) {
    @Provides
    @ActivityScope
    fun provideActivity(): AppCompatActivity = activity

    @Provides
    @ActivityScope
    fun provideActivityContext(): Context = activity.baseContext
}