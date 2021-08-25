package br.com.marco.apigithub

import android.app.Application
import br.com.marco.apigithub.data.di.DataModule
import br.com.marco.apigithub.domain.di.DomainModule
import br.com.marco.apigithub.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}