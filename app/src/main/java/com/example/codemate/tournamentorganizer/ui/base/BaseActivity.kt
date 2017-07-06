package com.example.codemate.tournamentorganizer.ui.home.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.Window
import android.view.WindowManager
import com.example.codemate.tournamentorganizer.App
import com.example.codemate.tournamentorganizer.R
import com.example.codemate.tournamentorganizer.app.di.component.ApplicationComponent
import com.example.codemate.tournamentorganizer.app.navigator.Navigator
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject

/**
 * Created by Alex Lindroos on 21/06/2017.
 */

abstract class BaseActivity : AppCompatActivity() {

    @Inject
    lateinit var navigator : Navigator
    abstract var layoutId: Int

    abstract fun attachPresenter()
    abstract fun detachPresenter()


    abstract fun setupInjection(applicationComponent: ApplicationComponent)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupInjection(App.graph)
        makeFullScreen()
        initView()
        setActionBar()
        navigator.currentActivity = this
    }


    override fun onStart() {
        super.onStart()
        attachPresenter()
    }

    override fun onStop() {
        super.onStop()
        detachPresenter()
    }

    private fun initView() {
        setContentView(layoutInflater.inflate(layoutId, null))
    }

    private fun makeFullScreen() {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    private fun setActionBar() {
        setSupportActionBar(toolbar)
        when (layoutId) {
            R.layout.activity_home -> supportActionBar?.setDisplayShowTitleEnabled(true)
            R.layout.activity_menu -> supportActionBar?.setDisplayShowTitleEnabled(true)
            else -> {
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
                supportActionBar?.setDisplayShowTitleEnabled(true)}
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}