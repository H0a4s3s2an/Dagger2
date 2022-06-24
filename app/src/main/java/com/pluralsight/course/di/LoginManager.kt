package com.pluralsight.course.di

import android.util.Log
import com.pluralsight.course.abstractions.CacheSource
import javax.inject.Inject

/*
Inversion Of Control
It is a design technique that handles objects creation. These components are called IoC
containers. The IoC’s responsibility is to manage the creation, configuration, and control of the
objects’ life cycle. It is the principle behind the Dependency Inversion (DIP)Principle from
SOLID Principles.
*/

class LoginManager @Inject constructor(val localStore: LocalStore, val apiService: ApiService) {
	fun login(username: String, password: String) {
		Log.d("LoginManager","login($username , $password)")
		val token = apiService.authenticate(username, password)
		localStore.saveToken(token)
	}
}