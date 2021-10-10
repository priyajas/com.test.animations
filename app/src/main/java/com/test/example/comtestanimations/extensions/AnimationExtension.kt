package com.test.example.comtestanimations.extensions

import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.annotation.AnimRes

fun View.animateWith(@AnimRes animation: Int) {
    try {
        val animate: Animation = AnimationUtils.loadAnimation(context, animation).apply { fillAfter = true }
        startAnimation(animate)
    } catch (e: Exception) {
        Log.e("Animation Failed", e.message ?: "Unknown Error")
    }
}
