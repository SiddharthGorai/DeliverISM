package com.ism.deliverism.FragHomeFrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ism.deliverism.ARG_PARAM1
import com.ism.deliverism.ARG_PARAM2
import com.ism.deliverism.R
import com.ism.deliverism.RecyclerViewAdapters.StatFragRecyclerViewAdapter
import com.ism.deliverism.statData


class stationaryHomeFrag : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private  lateinit var statAdapter: StatFragRecyclerViewAdapter
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
        return inflater.inflate(R.layout.fragment_stationary_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val statList: ArrayList<statData> = ArrayList()

        statList.add(statData("Pencil","Rs. 5",null))
        statList.add(statData("Pen","Rs. 5",null))
        statList.add(statData("Notebook","Rs. 40",null))
        statList.add(statData("Eraser","Rs. 5",null))

        val layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL,true)
        recyclerView = view.findViewById(R.id.statFragRecyclerView)
        recyclerView.layoutManager = layoutManager
        statAdapter = StatFragRecyclerViewAdapter(statList,this@stationaryHomeFrag)
        recyclerView.adapter = statAdapter
    }



}