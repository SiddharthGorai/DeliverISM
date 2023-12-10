package com.ism.deliverism

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.ism.deliverism.databinding.ActivityCartBinding


class cartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCartBinding
    lateinit var cartToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cartToolbar = binding.toolbarCart
        cartToolbar.setTitle("Cart")
        setSupportActionBar(cartToolbar)

        cartToolbar.setNavigationIcon(R.drawable.baseline_chevron_left_24)
        cartToolbar.setNavigationOnClickListener {
          onBackPressed()
        }


    }
}