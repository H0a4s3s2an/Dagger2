package com.pluralsight.course.container

import com.pluralsight.course.di.ApiService
import com.pluralsight.course.di.LocalStore
import com.pluralsight.course.di.LoginManager

class AppContainer {
	fun getLoingManager(): LoginManager {
		val cacheStore = LocalStore("Bearer abcdefghijklmnopqrs")
		val apiService = ApiService("hassan", "password")
		return LoginManager(cacheStore, apiService)
	}
}