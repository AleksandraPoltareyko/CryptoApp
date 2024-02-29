package com.example.cryptoapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptoapp.R
import com.example.cryptoapp.data.CoinInfo
import com.example.cryptoapp.data.CoinPriceInfo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_coin_info.view.*

class CoinInfoAdapter(private val context: Context): RecyclerView.Adapter<CoinInfoAdapter.CoinInfoViewHolder>() {

    var coinInfoList: List<CoinPriceInfo> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    var onCoinClickListener: OnCoinClickListener? = null

    inner class CoinInfoViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val ivLogoCoin = itemView.ivLogoCoin
        val tvDescription = itemView.tvDescription
        val tvPrice = itemView.tvPrice
        val tvSymbols = itemView.tvSymbols
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinInfoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_coin_info, parent,false)
        return CoinInfoViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoinInfoViewHolder, position: Int) {
        val coin = coinInfoList[position]
        with(holder){
            val symbolsTemplate = context.resources.getString(R.string.symbols_template)
            val lastUpdateTemplate = context.resources.getString(R.string.last_update_template)
            tvSymbols.text = String.format(symbolsTemplate, coin.fROMSYMBOL, coin.tOSYMBOL)
            tvPrice.text = coin.pRICE
            tvDescription.text = String.format(lastUpdateTemplate, coin.getFormatedTime())
            Picasso.get().load(coin.getFullImageUrl()).into(ivLogoCoin)
            itemView.setOnClickListener{
                onCoinClickListener?.OnCoinClick(coin)
            }
        }


    }

    override fun getItemCount() = coinInfoList.size

    interface OnCoinClickListener{
        fun OnCoinClick(coinPriceInfo: CoinPriceInfo)

    }

}