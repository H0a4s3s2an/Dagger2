package com.pluralsight.course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pluralsight.course.abstractions.CacheSource
import com.pluralsight.course.di.ApiService
import com.pluralsight.course.di.LocalStore
import com.pluralsight.course.di.LoginManager

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		/*create dependency manually*/
		val cacheStore = LocalStore("Bearer abcdefghijklmnopqrs")
		val apiService = ApiService("hassan", "password")
		val loginManager = LoginManager(cacheStore, apiService)
	}
}