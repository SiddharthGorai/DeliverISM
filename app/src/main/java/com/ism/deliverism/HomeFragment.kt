package com.ism.deliverism

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val homeTabLayout: TabLayout = view.findViewById(R.id.homeTablayout)
        val homeViewPager: ViewPager = view.findViewById(R.id.homeViewPager)

        homeTabLayout.addTab(homeTabLayout.newTab().setText("Foods"))
        homeTabLayout.addTab(homeTabLayout.newTab().setText("Stationary"))
        homeTabLayout.addTab(homeTabLayout.newTab().setText("Shops"))
        homeTabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val supportFragmentManager = childFragmentManager

        val adapter = HomeTabAdapter(MainActivity(), supportFragmentManager, homeTabLayout.tabCount)
        homeViewPager.adapter = adapter

        homeViewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(homeTabLayout))
        homeTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                homeViewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

    }


}
