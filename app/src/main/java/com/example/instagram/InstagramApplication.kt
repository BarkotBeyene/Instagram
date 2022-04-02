package com.example.instagram

import android.app.Application
import com.parse.Parse
import com.parse.ParseObject

class InstagramApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ParseObject.registerSubclass(Post::class.java)


        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId("HMXtrIFqNPRkAquuNiufcWrQYSSgAw07Rp0KwgjS")
                .clientKey("NClZVkuyfd40ymew44yLf9bNwQmZcWmDkzEHDU2w")
                .server(getString(R.string.back4app_server_url))
                .build());

    }
}