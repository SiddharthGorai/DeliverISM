package com.ism.deliverism.RecyclerViewAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ism.deliverism.FragHomeFrag.shopHomeFrag
import com.ism.deliverism.R
import com.ism.deliverism.shopData

class ShopFragRecyclerViewAdapter (private val shopList:ArrayList<shopData>, private val context: shopHomeFrag):
    RecyclerView.Adapter<ShopFragRecyclerViewAdapter.MyviewHolder>()  {

    class MyviewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val shopName: TextView = itemView.findViewById(R.id.itemName)
        val shopPrice: TextView = itemView.findViewById(R.id.itemPrice)
        val shopImage: ImageView = itemView.findViewById(R.id.itemImage)

//        init{
//            itemView.setOnClickListener {
//                listener.onItemClick(adapterPosition)
//            }
    }
    //    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopFragRecyclerViewAdapter.MyviewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_item,parent,false)
        return MyviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ShopFragRecyclerViewAdapter.MyviewHolder, position: Int) {

        Glide.with(context).load(R.drawable.shop).into(holder.shopImage)
        holder.shopName.text = shopList[position].shopName
        holder.shopPrice.visibility = View.INVISIBLE
    }
    override fun getItemCount(): Int {
        return shopList.size
    }

}