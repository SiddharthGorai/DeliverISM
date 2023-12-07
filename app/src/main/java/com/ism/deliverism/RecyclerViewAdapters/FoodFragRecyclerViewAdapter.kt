package com.ism.deliverism.RecyclerViewAdapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ism.deliverism.FragHomeFrag.foodHomeFrag
import com.ism.deliverism.R
import com.ism.deliverism.foodData

class FoodFragRecyclerViewAdapter(private val foodList:ArrayList<foodData>,
                                  private val context: foodHomeFrag):
    RecyclerView.Adapter<FoodFragRecyclerViewAdapter.MyviewHolder>() {


    private lateinit var pListener: onItemClickListener
    interface onItemClickListener{
        fun onItemClick(position: Int)
    }
    fun setOnItemClickListener(listener: onItemClickListener){
        pListener = listener
    }
    class MyviewHolder(itemView: View, listener: onItemClickListener): RecyclerView.ViewHolder(itemView){
        val foodName: TextView = itemView.findViewById(R.id.foodName)
        val foodPrice: TextView = itemView.findViewById(R.id.foodPrice)

        init{
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodFragRecyclerViewAdapter.MyviewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.food_item,parent,false)
        return MyviewHolder(itemView,pListener)
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {

//        Glide.with(context).load(userList[position].image).into(holder.imgView)
        holder.foodName.text = foodList[position].foodName
        holder.foodPrice.text = foodList[position].foodPrice.toString()
    }
    override fun getItemCount(): Int {
        return foodList.size
    }

}
