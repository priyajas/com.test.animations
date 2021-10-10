package com.test.example.comtestanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.test.example.comtestanimations.databinding.ActivityMainBinding
import com.test.example.comtestanimations.extensions.animateWith

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.BTNblink.setOnClickListener {
            binding.imageview.animateWith(R.anim.blink_animation)
        }

        binding.BTNfade.setOnClickListener {
            binding.imageview.animateWith(R.anim.fade_animation)
        }
        binding.BTNmove.setOnClickListener {
            binding.imageview.animateWith(R.anim.move_animation)
        }
        binding.BTNrotate.setOnClickListener {
            binding.imageview.animateWith(R.anim.rotate_animation)
        }
        binding.BTNslide.setOnClickListener {
            binding.imageview.animateWith(R.anim.slide_animation)
        }
        binding.BTNzoom.setOnClickListener {
            binding.imageview.animateWith(R.anim.zoom_animation)
        }
        binding.BTNstop.setOnClickListener {
            binding.imageview.clearAnimation()
        }
    }


}