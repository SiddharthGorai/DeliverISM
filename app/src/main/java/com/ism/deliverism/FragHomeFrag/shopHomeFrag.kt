package com.ism.deliverism.FragHomeFrag

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ism.deliverism.ARG_PARAM1
import com.ism.deliverism.ARG_PARAM2
import com.ism.deliverism.R

/**
 * A simple [Fragment] subclass.
 * Use the [shopHomeFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class shopHomeFrag : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
        return inflater.inflate(R.layout.fragment_shop_home, container, false)
    }

     }