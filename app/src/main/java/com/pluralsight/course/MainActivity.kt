package com.pluralsight.course

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pluralsight.course.di.ApiService
import com.pluralsight.course.di.LocalStore
import com.pluralsight.course.di.LoginManager
import com.pluralsight.course.di.component.DaggerLoginComponent

/*Dagger abstracts all heavy parts of handling the dependencies on behalf of you.
Dagger2 uses annotation processing from the Java compiler to generate a lot of code for you,
so Dagger is a code generator tool. As the official Documentation for Dagger says,
“It generates code that mimics the code that a user might have hand-written to ensure that
dependency injection is as simple, traceable and performant as it can be.”All
the code generation happens at the compile-time, not runtime*/

/*There are two versions of Dagger2: the pure Dagger for Java developers and another for Android
Developers called Dagger-Android. We will work on the Pure Dagger first then know the special
handling for Android later.*/

/*we need to remove the AppContainer class and login manager instance from
BaseApp class because we are going to use the Dagger library now to provide this instance, not
pure dependency Injection*/

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

/*	    Do you think this is a good approach?. I do not, because if the login manager depends on
        more other objects, I have to create them first then pass them to the login manager, so it
        is a hassle. So what is the best solution for this problem?. To solve this problem, Dagger
        provides a technique called Component*/
		
/*		val cacheSource = LocalStore()
		val apiService = ApiService()
		val loginManager = LoginManager(cacheSource, apiService)
		loginManager.login("hassan", "112233")*/
		
/*		To tell Dagger that you need to create a new instance from a particular
		class you need to add the @Inject annotation to the class constructor*/
		
/*		However, there are some situations @Inject fails to help you to declare your independence like
		the following:
		● Interfaces
		● Third-Party libraries like Glide for Image loading,
		For instance, I will create a Cache Module to provide Local Store dependency to the
		LoginComponent where the Local Store implements interface and interfaces can not be
		constructed. So I have to use the module to solve this issue. To create a module, you
		create a new class and annotate this class with @Module annotation. After that, you
		make a method to provide an instance from LocalStore as a cache source type using
		@Provides annotation.*/
		
/*		Now we knew how to declare our dependencies, what about gathering
		them in one place that can be shared from different activities or fragments
		(client-side). This centralized place called Component*/
		
/*		Dagger Component is a bridge between the client and the service. In our case, the client
        is the MainActivity case, and the service is LoginManager. It gives the client what it needs
		when it asks. To create a Dagger component, you need to define a new interface and
		your methods, but you must annotate this interface with @Component.Let’s add a new
		package called component under di package in our project. Under this package, I will
		create a new interface called LoginComponent. I will add @Component annotation on
		the top of this interface and attach the cache module to the Login
		component in the array modules.*/
		
		// using dagger component
		val loginComponent = DaggerLoginComponent.create()
		loginComponent.getLoginManager().login("hassan","112233")
		
	}
}