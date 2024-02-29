package com.example.cryptoapp.data


import com.google.gson.annotations.SerializedName

data class CoinInfo(

    @SerializedName("Name")
    val name: String
)