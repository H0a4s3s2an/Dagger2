package com.pluralsight.course.di

import com.pluralsight.course.abstractions.CacheSource

class LocalStore(val token: String): CacheSource {
}