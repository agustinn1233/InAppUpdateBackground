package com.agustinf1233.inappupdate.di

import com.agustinf1233.inappupdate.UpdatesApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class, ActivityModule::class, AppModule::class])
interface AppComponent : AndroidInjector<UpdatesApplication> {
    @Component.Factory
    abstract class Factory : AndroidInjector.Factory<UpdatesApplication>
}