package com.example.myvisa.remote

import com.example.myvisa.model.ProfileResponse
import retrofit2.http.GET

interface MyVisaApi {

    @GET("")
    suspend fun fetchAllRecords():ProfileResponse
}