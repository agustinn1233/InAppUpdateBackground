package com.agustinf1233.inappupdate.di

import com.agustinf1233.inappupdate.UpdatesApplication
import com.google.android.play.core.appupdate.AppUpdateManager
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.tasks.TaskExecutors
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor

@Module
object AppModule {

    @Provides
    fun providesInAppUpdateManager(application: UpdatesApplication): AppUpdateManager {

        return AppUpdateManagerFactory.create(application)
    }

    @Provides
    fun providesPlayServiceExecutor(): Executor {

        return TaskExecutors.MAIN_THREAD
    }
}