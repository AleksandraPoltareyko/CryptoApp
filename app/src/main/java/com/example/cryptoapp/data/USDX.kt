package com.example.cryptoapp.data


import com.google.gson.annotations.SerializedName

data class USDX(
    @SerializedName("CHANGE24HOUR")
    val cHANGE24HOUR: Double,
    @SerializedName("CHANGEDAY")
    val cHANGEDAY: Double,
    @SerializedName("CHANGEHOUR")
    val cHANGEHOUR: Double,
    @SerializedName("CHANGEPCT24HOUR")
    val cHANGEPCT24HOUR: Double,
    @SerializedName("CHANGEPCTDAY")
    val cHANGEPCTDAY: Double,
    @SerializedName("CHANGEPCTHOUR")
    val cHANGEPCTHOUR: Double,
    @SerializedName("CIRCULATINGSUPPLY")
    val cIRCULATINGSUPPLY: Int,
    @SerializedName("CIRCULATINGSUPPLYMKTCAP")
    val cIRCULATINGSUPPLYMKTCAP: Double,
    @SerializedName("CONVERSIONLASTUPDATE")
    val cONVERSIONLASTUPDATE: Int,
    @SerializedName("CONVERSIONSYMBOL")
    val cONVERSIONSYMBOL: String,
    @SerializedName("CONVERSIONTYPE")
    val cONVERSIONTYPE: String,
    @SerializedName("FLAGS")
    val fLAGS: String,
    @SerializedName("FROMSYMBOL")
    val fROMSYMBOL: String,
    @SerializedName("HIGH24HOUR")
    val hIGH24HOUR: Double,
    @SerializedName("HIGHDAY")
    val hIGHDAY: Double,
    @SerializedName("HIGHHOUR")
    val hIGHHOUR: Double,
    @SerializedName("IMAGEURL")
    val iMAGEURL: String,
    @SerializedName("LASTMARKET")
    val lASTMARKET: String,
    @SerializedName("LASTTRADEID")
    val lASTTRADEID: String,
    @SerializedName("LASTUPDATE")
    val lASTUPDATE: Int,
    @SerializedName("LASTVOLUME")
    val lASTVOLUME: Double,
    @SerializedName("LASTVOLUMETO")
    val lASTVOLUMETO: Double,
    @SerializedName("LOW24HOUR")
    val lOW24HOUR: Double,
    @SerializedName("LOWDAY")
    val lOWDAY: Double,
    @SerializedName("LOWHOUR")
    val lOWHOUR: Double,
    @SerializedName("MARKET")
    val mARKET: String,
    @SerializedName("MEDIAN")
    val mEDIAN: Double,
    @SerializedName("MKTCAP")
    val mKTCAP: Double,
    @SerializedName("MKTCAPPENALTY")
    val mKTCAPPENALTY: Int,
    @SerializedName("OPEN24HOUR")
    val oPEN24HOUR: Double,
    @SerializedName("OPENDAY")
    val oPENDAY: Double,
    @SerializedName("OPENHOUR")
    val oPENHOUR: Double,
    @SerializedName("PRICE")
    val pRICE: Double,
    @SerializedName("SUPPLY")
    val sUPPLY: Int,
    @SerializedName("TOPTIERVOLUME24HOUR")
    val tOPTIERVOLUME24HOUR: Double,
    @SerializedName("TOPTIERVOLUME24HOURTO")
    val tOPTIERVOLUME24HOURTO: Double,
    @SerializedName("TOSYMBOL")
    val tOSYMBOL: String,
    @SerializedName("TOTALTOPTIERVOLUME24H")
    val tOTALTOPTIERVOLUME24H: Double,
    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    val tOTALTOPTIERVOLUME24HTO: Double,
    @SerializedName("TOTALVOLUME24H")
    val tOTALVOLUME24H: Double,
    @SerializedName("TOTALVOLUME24HTO")
    val tOTALVOLUME24HTO: Double,
    @SerializedName("TYPE")
    val tYPE: String,
    @SerializedName("VOLUME24HOUR")
    val vOLUME24HOUR: Double,
    @SerializedName("VOLUME24HOURTO")
    val vOLUME24HOURTO: Double,
    @SerializedName("VOLUMEDAY")
    val vOLUMEDAY: Double,
    @SerializedName("VOLUMEDAYTO")
    val vOLUMEDAYTO: Double,
    @SerializedName("VOLUMEHOUR")
    val vOLUMEHOUR: Double,
    @SerializedName("VOLUMEHOURTO")
    val vOLUMEHOURTO: Double
)