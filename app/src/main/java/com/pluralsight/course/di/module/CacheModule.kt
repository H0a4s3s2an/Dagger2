package com.pluralsight.course.di.module

import com.pluralsight.course.abstractions.CacheSource
import com.pluralsight.course.di.LocalStore
import dagger.Module
import dagger.Provides

@Module
class CacheModule {
	@Provides
	fun provideCacheSource(localStore: LocalStore) : CacheSource {
		return localStore
	}
}