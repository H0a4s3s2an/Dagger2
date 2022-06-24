package com.pluralsight.course.di.component

import com.pluralsight.course.di.LoginManager
import com.pluralsight.course.di.module.CacheModule
import dagger.Component

@Component(modules = [CacheModule::class])
interface LoginComponent {
	fun getLoginManager(): LoginManager
}