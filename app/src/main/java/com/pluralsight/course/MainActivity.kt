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
		val loginManager = (application as BaseApp).loginManager
		loginManager.print()
		
		/*As we can see now, we can use the app container and reuse it in any other activities. The
		container is managed from the App class. This is a good improvement, but let’s imagine the
		following scenario. You are working on a large project with many features and many screens.
		Do you think the manual or pure Dependency Injection will be an effective solution?. I think you
		agree with me that this is not effective anymore. Because in a large project, you will need to
		handle many dependency creations by yourself. Also, the object creation may be very complex,
		and you do not need to recreate them every time. So I will need a framework that handles this
		creation and remove the boilerplate code. Sometimes you will need scope or object lifetime for
		the specific feature, not the whole app, to come to the scene.
		*/
	}
}