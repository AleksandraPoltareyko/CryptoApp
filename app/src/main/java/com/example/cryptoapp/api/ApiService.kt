package com.example.cryptoapp.api

import com.example.cryptoapp.data.CoinPriceInfoRawData
import com.example.cryptoapp.data.ObjectCrypto
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
        @Query(QUERY_PARAM_API_KEY) apiKey:String = "6f20e88d073f26473b38b83299f9728f2a6909867a9ed2b5c38c00375c307cbb",
        @Query(QUERY_PARAM_TO_SYMBOL) tsym:String = CURRENCY,
        @Query(QUERY_PARAM_LIMIT) limit:Int = 10
    ):Single<ObjectCrypto>

    @GET("pricemultifull")
    fun getFullPriceList(
        @Query(QUERY_PARAM_API_KEY) apiKey:String = "6f20e88d073f26473b38b83299f9728f2a6909867a9ed2b5c38c00375c307cbb",
        @Query(QUERY_PARAM_FROM_SYMBOLS) fsyms:String,
        @Query(QUERY_PARAM_TO_SYMBOLS) tsyms:String = CURRENCY
    ):Single<CoinPriceInfoRawData>

    companion object{
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_TO_SYMBOL = "tsym"
        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"

        private const val CURRENCY = "USD"
    }
}