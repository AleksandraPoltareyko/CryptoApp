package com.example.cryptoapp.data


import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinPriceInfoRawData(

    @SerializedName("RAW")
    @Expose
    val coinPriseInfoJSONObject: JsonObject? = null
)