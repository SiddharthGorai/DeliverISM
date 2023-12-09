package com.ism.deliverism.RecyclerViewAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ism.deliverism.FragHomeFrag.stationaryHomeFrag
import com.ism.deliverism.R
import com.ism.deliverism.statData

class StatFragRecyclerViewAdapter (private val statList:ArrayList<statData>,private val context: stationaryHomeFrag):
    RecyclerView.Adapter<StatFragRecyclerViewAdapter.MyviewHolder>() {


//    private lateinit var pListener: onItemClickListener

    //    interface onItemClickListener{
//        fun onItemClick(position: Int)
//    }
//    fun setOnItemClickListener(listener: onItemClickListener){
//        pListener = listener
//    }
    class MyviewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val statName: TextView = itemView.findViewById(R.id.itemName)
        val statPrice: TextView = itemView.findViewById(R.id.itemPrice)
        val statImage: ImageView = itemView.findViewById(R.id.itemImage)

//        init{
//            itemView.setOnClickListener {
//                listener.onItemClick(adapterPosition)
//            }
    }
    //    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatFragRecyclerViewAdapter.MyviewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_item,parent,false)
        return MyviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {

        Glide.with(context).load(R.drawable.pencil).into(holder.statImage)
        holder.statName.text = statList[position].statName
        holder.statPrice.text = statList[position].statPrice
    }
    override fun getItemCount(): Int {
        return statList.size
    }
    
    }