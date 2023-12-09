package com.ism.deliverism.FragHomeFrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ism.deliverism.ARG_PARAM1
import com.ism.deliverism.ARG_PARAM2
import com.ism.deliverism.R
import com.ism.deliverism.RecyclerViewAdapters.FoodFragRecyclerViewAdapter
import com.ism.deliverism.foodData


class foodHomeFrag : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private  lateinit var foodAdapter: FoodFragRecyclerViewAdapter
    private  lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val see_more_food: TextView = view.findViewById(R.id.see_more_food)
        see_more_food.setOnClickListener{

        }

        val foodList: ArrayList<foodData> = ArrayList()

        foodList.add(foodData("Samosa","Rs. 7",null))
        foodList.add(foodData("Pakora","Rs. 7",null))
        foodList.add(foodData("Kurkure","Rs. 20",null))
        foodList.add(foodData("Parle-G","Rs. 10",null))

        val layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,true)
        recyclerView = view.findViewById(R.id.foodFragRecyclerView)
        recyclerView.layoutManager = layoutManager
        foodAdapter = FoodFragRecyclerViewAdapter(foodList,this@foodHomeFrag)
        recyclerView.adapter = foodAdapter


    }
}

