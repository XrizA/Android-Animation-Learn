package io.github.xriza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alphaButton.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.alpha))
        }

        scaleButton.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scale))
        }

        translateButton.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate))
        }

        rotateButton.setOnClickListener {
            imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))
        }
    }
}