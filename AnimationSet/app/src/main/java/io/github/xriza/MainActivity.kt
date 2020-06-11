package io.github.xriza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fromDegree = 0.0f
        var toDegree = 0.0f

        rotateButton.setOnClickListener {
            val rotateDegree = 90
            toDegree = fromDegree + rotateDegree

            val animation = RotateAnimation(
                    fromDegree, // start angle
                    toDegree, // end angle
                    RotateAnimation.RELATIVE_TO_SELF, // pivot x type
                    0.5f, // set x rotation center
                    RotateAnimation.RELATIVE_TO_SELF, // pivot y type
                    0.5f) // set y rotation center

            animation.duration = 1000 // Duration of the animation
            animation.fillAfter = true

            this.image.startAnimation(animation)

            fromDegree = toDegree
        }

        alphaButton.setOnClickListener {
            val animation = AlphaAnimation(1.0f, 0.2f)
            animation.duration = 1000
            animation.fillAfter = true

            this.image.startAnimation(animation)
        }

        scaleButton.setOnClickListener {
            val animation = ScaleAnimation(
                1.0f,
                1.5f,
                1.0f,
                1.5f,
                Animation.RELATIVE_TO_SELF, 1f,
                Animation.RELATIVE_TO_SELF, 1f)
            animation.duration = 1000
            animation.fillAfter = true

            this.image.startAnimation(animation)
        }

        translateButton.setOnClickListener {
            val animation = TranslateAnimation(
                0f,
                100f,
                0f,
                -100f)
            animation.duration = 1000
            animation.fillAfter = true

            this.image.startAnimation(animation)
        }
    }
}