package com.pluralsight.course

import android.app.Application
import com.pluralsight.course.container.AppContainer
import com.pluralsight.course.di.LoginManager

class BaseApp : Application() {
	val loginManager: LoginManager by lazy {
		AppContainer().getLoingManager()
	}
}