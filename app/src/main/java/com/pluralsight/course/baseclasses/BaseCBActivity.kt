package com.pluralsight.course.baseclasses

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner

abstract class BaseCBActivity : AppCompatActivity(), BaseLifecycleComponent {
    override val thisLifecycleOwner: LifecycleOwner get() = this

    init {
        lifecycle.addObserver(this)
    }

    lateinit var topView: View

    override fun onDestroy() {
        super.onDestroy()
        lifecycle.removeObserver(this)
    }
}
