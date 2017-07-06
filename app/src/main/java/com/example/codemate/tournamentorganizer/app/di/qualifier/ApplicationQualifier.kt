package com.example.codemate.tournamentorganizer.app.di.qualifier

import javax.inject.Qualifier

/**
 * Created by Alex Lindroos on 21/06/2017.
 *
 * @Qualifier annotation helps us to create “tags” for dependencies which have the same interface. Imagine that you need to provide two RestAdapter objects - one for Github API, another for facebook API. Qualifier will help you to identify the proper one:
 */
@Qualifier
annotation class ApplicationQualifier