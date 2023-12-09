package com.ism.deliverism.RecyclerViewAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ism.deliverism.FragHomeFrag.foodHomeFrag
import com.ism.deliverism.FragHomeFrag.stationaryHomeFrag
import com.ism.deliverism.R
import com.ism.deliverism.foodData

class FoodFragRecyclerViewAdapter(private val foodList:ArrayList<foodData>, private val context: foodHomeFrag):
    RecyclerView.Adapter<FoodFragRecyclerViewAdapter.MyviewHolder>() {


//    private lateinit var pListener: onItemClickListener

//    interface onItemClickListener{
//        fun onItemClick(position: Int)
//    }
//    fun setOnItemClickListener(listener: onItemClickListener){
//        pListener = listener
//    }
    class MyviewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val foodName: TextView = itemView.findViewById(R.id.itemName)
        val foodPrice: TextView = itemView.findViewById(R.id.itemPrice)
        val foodImage: ImageView = itemView.findViewById(R.id.itemImage)

//        init{
//            itemView.setOnClickListener {
//                listener.onItemClick(adapterPosition)
//            }
        }
//    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodFragRecyclerViewAdapter.MyviewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_item,parent,false)
        return MyviewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {

        Glide.with(context).load(R.drawable.burger).into(holder.foodImage)
        holder.foodName.text = foodList[position].foodName
        holder.foodPrice.text = foodList[position].foodPrice
    }
    override fun getItemCount(): Int {
        return foodList.size
    }

}
