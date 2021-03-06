package com.mazouri.mvpkotlin.injection.module

import android.app.Application
import android.content.Context
import com.mazouri.mvpkotlin.data.GithubService
import com.mazouri.mvpkotlin.data.GithubServiceFactory
import com.mazouri.mvpkotlin.injection.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by wangdongdong on 17-5-22.
 */
@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    @Singleton
    fun provideApplication(): Application {
        return mApplication
    }

    @Provides
    @ApplicationContext
    fun provideContext(): Context {
        return mApplication
    }


}