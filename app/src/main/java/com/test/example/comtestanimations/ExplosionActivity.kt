package com.test.example.comtestanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.test.example.comtestanimations.databinding.ActivityExplosionBinding
import com.test.example.comtestanimations.extensions.startAnimation

class ExplosionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExplosionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExplosionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animation = AnimationUtils.loadAnimation(this, R.anim.circle_explosion_anim).apply {
            duration = 700
            interpolator = AccelerateDecelerateInterpolator()
        }

        binding.fab.setOnClickListener {
            binding.fab.isVisible = false
            binding.circle.isVisible = true
            binding.circle.startAnimation(animation) {
                // display your fragment
                binding.root.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_500))
                binding.circle.isVisible = false
            }
        }
    }
}

