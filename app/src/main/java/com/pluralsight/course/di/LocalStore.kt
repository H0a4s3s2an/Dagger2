package com.pluralsight.course.di

import android.util.Log
import com.pluralsight.course.abstractions.CacheSource
import javax.inject.Inject

/*		To tell Dagger that you need to create a new instance from a particular
		class you need to add the @Inject annotation to the class constructor*/
class LocalStore @Inject constructor() : CacheSource {
	fun saveToken(token: String) {
		Log.d("token",token)
	}
}