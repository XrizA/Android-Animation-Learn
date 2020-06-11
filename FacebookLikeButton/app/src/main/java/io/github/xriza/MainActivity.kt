package io.github.xriza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.RotateAnimation
import android.view.animation.ScaleAnimation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var isLike = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        like.setOnClickListener {
            // Step 1: Change photo
            if (isLike) {
                // Cancel Likes
                like.setImageResource(R.mipmap.fblike_notselect)
            } else {
                // Press to praise.
                like.setImageResource(R.mipmap.fblike_select)
            }

            // Add a collection of animations
            val animSet = AnimationSet(true)

            // Step 2: Magnify the animation by 1.2x
            val animation = ScaleAnimation(
                    1.0f,
                    1.2f,
                    1.0f,
                    1.2f,
                    Animation.RELATIVE_TO_SELF, 1f,
                    Animation.RELATIVE_TO_SELF, 1f)
            animation.duration = 200

            // Step 3: Rotate -20 animation
            val rotateAnimation = RotateAnimation(
                    0.0f,
                    -20f,
                    RotateAnimation.RELATIVE_TO_SELF,
                    0.5f,
                    RotateAnimation.RELATIVE_TO_SELF,
                    0.5f)

            // Duration of the animation
            rotateAnimation.duration = 200

            // Put the zoomed and rotated animation into an animated collection
            animSet.addAnimation(animation)
            animSet.addAnimation(rotateAnimation)

            // Step 4: Start animation
            this.like.startAnimation(animSet)
            isLike = !isLike
        }
    }
}