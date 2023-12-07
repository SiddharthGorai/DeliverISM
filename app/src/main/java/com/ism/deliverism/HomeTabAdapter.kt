package com.ism.deliverism


import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.ism.deliverism.FragHomeFrag.foodHomeFrag
import com.ism.deliverism.FragHomeFrag.shopHomeFrag
import com.ism.deliverism.FragHomeFrag.stationaryHomeFrag

internal class HomeTabAdapter(var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                foodHomeFrag()
            }

            1 -> {
               stationaryHomeFrag()
            }
            2 -> {
                shopHomeFrag()
            }

            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}