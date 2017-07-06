package com.example.codemate.tournamentorganizer.app.di.component

import com.example.codemate.tournamentorganizer.app.di.module.ActivityModule
import com.example.codemate.tournamentorganizer.app.di.module.ApplicationModule
import com.example.codemate.tournamentorganizer.app.di.subcomponent.addresult.AddResultActivityComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.addresult.AddResultActivityModule
import com.example.codemate.tournamentorganizer.app.di.subcomponent.fixture.FixtureActivityComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.fixture.FixtureActivityModule
import com.example.codemate.tournamentorganizer.app.di.subcomponent.home.HomeActivityComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.home.HomeActivityModule
import com.example.codemate.tournamentorganizer.app.di.subcomponent.menu.MenuActivityComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.menu.MenuActivityModule
import com.example.codemate.tournamentorganizer.app.di.subcomponent.options.OptionsActivityComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.options.OptionsActivityModule
import com.example.codemate.tournamentorganizer.app.di.subcomponent.scoreboard.ScoreBoardActivityComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.scoreboard.ScoreBoardActivityModule
import com.example.codemate.tournamentorganizer.app.di.subcomponent.splash.SplashActivityComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.splash.SplashActivityModule
import com.example.codemate.tournamentorganizer.app.di.subcomponent.teampicker.TeamPickerActivityComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.teampicker.TeamPickerActivityModule
import com.example.codemate.tournamentorganizer.app.di.subcomponent.tournamentcreator.TournamentCreatorActivityComponent
import com.example.codemate.tournamentorganizer.app.di.subcomponent.tournamentcreator.TournamentCreatorActivityModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Alex Lindroos on 21/06/2017.
 */
@Singleton
@Component(modules = arrayOf(
        ActivityModule::class,
        ApplicationModule::class
))
interface ApplicationComponent {
    fun plus (module: SplashActivityModule) : SplashActivityComponent
    fun plus (module: HomeActivityModule) : HomeActivityComponent
    fun plus (module: TournamentCreatorActivityModule) : TournamentCreatorActivityComponent
    fun plus (module: OptionsActivityModule) : OptionsActivityComponent
    fun plus (module: AddResultActivityModule) : AddResultActivityComponent
    fun plus (module: ScoreBoardActivityModule) : ScoreBoardActivityComponent
    fun plus (module: TeamPickerActivityModule) : TeamPickerActivityComponent
    fun plus (module: MenuActivityModule) : MenuActivityComponent
    fun plus (module: FixtureActivityModule) : FixtureActivityComponent
}