package co.ghostnotes.sample.navigation.util.extensions

import android.widget.Toast
import androidx.annotation.IdRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import co.ghostnotes.sample.navigation.R

fun AppCompatActivity.commitNow(fragment: Fragment, @IdRes resId: Int = R.id.container) {
    supportFragmentManager.beginTransaction()
        .replace(resId, fragment)
        .commitNow()
}

fun AppCompatActivity.toast(@StringRes resId: Int, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, resId, duration).show()
}
