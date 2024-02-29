package com.example.cryptoapp.data


import com.google.gson.annotations.SerializedName

data class BTCX(
    @SerializedName("USD")
    val uSD: USDX
)