package com.pluralsight.course.di

import android.util.Log
import com.pluralsight.course.abstractions.CacheSource

/*
Inversion Of Control
It is a design technique that handles objects creation. These components are called IoC
containers. The IoC’s responsibility is to manage the creation, configuration, and control of the
objects’ life cycle. It is the principle behind the Dependency Inversion (DIP)Principle from
SOLID Principles.
*/

class LoginManager(val localStore: CacheSource, val apiService: ApiService) {
	fun print() {
		Log.d(LoginManager::class.simpleName, apiService.username + " " + apiService.password)
	}
}