package com.example.networktestkotlin

import retrofit2.Retrofit

class APIClient {
    companion object {
        fun create(): APIClient {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory()
                .addConverterFactory()
                .baseUrl()
                .build()
        }
    }
}