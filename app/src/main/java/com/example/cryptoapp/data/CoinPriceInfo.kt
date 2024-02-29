package com.example.cryptoapp.data


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cryptoapp.api.ApiFactory.BASE_IMAGE_URL
import com.example.cryptoapp.utils.convertTimestampToTime
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_price_list")
data class CoinPriceInfo(
    @SerializedName("CHANGE24HOUR")
    val cHANGE24HOUR: String,
    @SerializedName("CHANGEDAY")
    val cHANGEDAY: String,
    @SerializedName("CHANGEHOUR")
    val cHANGEHOUR: String,
    @SerializedName("CHANGEPCT24HOUR")
    val cHANGEPCT24HOUR: String,
    @SerializedName("CHANGEPCTDAY")
    val cHANGEPCTDAY: String,
    @SerializedName("CHANGEPCTHOUR")
    val cHANGEPCTHOUR: String,
    @SerializedName("CIRCULATINGSUPPLY")
    val cIRCULATINGSUPPLY: String,
    @SerializedName("CIRCULATINGSUPPLYMKTCAP")
    val cIRCULATINGSUPPLYMKTCAP: String,
    @SerializedName("CONVERSIONLASTUPDATE")
    val cONVERSIONLASTUPDATE: String,
    @SerializedName("CONVERSIONSYMBOL")
    val cONVERSIONSYMBOL: String,
    @SerializedName("CONVERSIONTYPE")
    val cONVERSIONTYPE: String,
    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    val fROMSYMBOL: String,
    @SerializedName("HIGH24HOUR")
    val hIGH24HOUR: String,
    @SerializedName("HIGHDAY")
    val hIGHDAY: String,
    @SerializedName("HIGHHOUR")
    val hIGHHOUR: String,
    @SerializedName("IMAGEURL")
    val iMAGEURL: String,
    @SerializedName("LASTMARKET")
    val lASTMARKET: String,
    @SerializedName("LASTTRADEID")
    val lASTTRADEID: String,
    @SerializedName("LASTUPDATE")
    val lASTUPDATE: Long,
    @SerializedName("LASTVOLUME")
    val lASTVOLUME: String,
    @SerializedName("LASTVOLUMETO")
    val lASTVOLUMETO: String,
    @SerializedName("LOW24HOUR")
    val lOW24HOUR: String,
    @SerializedName("LOWDAY")
    val lOWDAY: String,
    @SerializedName("LOWHOUR")
    val lOWHOUR: String,
    @SerializedName("MARKET")
    val mARKET: String,
    @SerializedName("MKTCAP")
    val mKTCAP: String,
    @SerializedName("MKTCAPPENALTY")
    val mKTCAPPENALTY: String,
    @SerializedName("OPEN24HOUR")
    val oPEN24HOUR: String,
    @SerializedName("OPENDAY")
    val oPENDAY: String,
    @SerializedName("OPENHOUR")
    val oPENHOUR: String,
    @SerializedName("PRICE")
    val pRICE: String,
    @SerializedName("SUPPLY")
    val sUPPLY: String,
    @SerializedName("TOPTIERVOLUME24HOUR")
    val tOPTIERVOLUME24HOUR: String,
    @SerializedName("TOPTIERVOLUME24HOURTO")
    val tOPTIERVOLUME24HOURTO: String,
    @SerializedName("TOSYMBOL")
    val tOSYMBOL: String,
    @SerializedName("TOTALTOPTIERVOLUME24H")
    val tOTALTOPTIERVOLUME24H: String,
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    val tOTALTOPTIERVOLUME24HTO: String,
    @SerializedName("TOTALVOLUME24H")
    val tOTALVOLUME24H: String,
    @SerializedName("TOTALVOLUME24HTO")
    val tOTALVOLUME24HTO: String,
    @SerializedName("VOLUME24HOUR")
    val vOLUME24HOUR: String,
    @SerializedName("VOLUME24HOURTO")
    val vOLUME24HOURTO: String,
    @SerializedName("VOLUMEDAY")
    val vOLUMEDAY: String,
    @SerializedName("VOLUMEDAYTO")
    val vOLUMEDAYTO: String,
    @SerializedName("VOLUMEHOUR")
    val vOLUMEHOUR: String,
    @SerializedName("VOLUMEHOURTO")
    val vOLUMEHOURTO: String
){
    fun getFormatedTime():String{
       return convertTimestampToTime(lASTUPDATE)
    }
    fun getFullImageUrl():String{
        return BASE_IMAGE_URL + iMAGEURL
    }
}