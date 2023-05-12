package com.example.android3lesson7dz

import android.app.Application
import com.example.android3lesson7dz.data.remote.RetrofitClient
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    companion object {
        val retrofitClient = RetrofitClient().providePokemonApiServices()
    }
}