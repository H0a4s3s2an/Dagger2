package com.pluralsight.course.baseclasses

import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner


abstract class BaseCBFragment : Fragment(), BaseLifecycleComponent {
    override val thisLifecycleOwner: LifecycleOwner get() = this

    init {
        lifecycle.addObserver(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycle.removeObserver(this)
    }
}
