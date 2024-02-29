package com.example.cryptoapp.data


import com.google.gson.annotations.SerializedName

data class ObjectCrypto(
    @SerializedName("Data")
    val `data`: List<Data>
)