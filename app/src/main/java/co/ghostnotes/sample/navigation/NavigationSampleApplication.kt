package co.ghostnotes.sample.navigation

import android.app.Application
import timber.log.Timber

class NavigationSampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        setUpTimber()
    }

    private fun setUpTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

}