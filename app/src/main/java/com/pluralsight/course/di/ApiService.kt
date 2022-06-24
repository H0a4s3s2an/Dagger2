package com.pluralsight.course.di

import android.util.Log
import javax.inject.Inject

class ApiService @Inject constructor(){
	fun authenticate(username: String, password: String): String {
		Log.d("auth","username : $username and pass : $password")
		return "Bearer abcdefgh"
	}
}