package io.github.xriza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animationSet.setOnClickListener {
            val animSet = AnimationSet(true)
            animSet.isFillEnabled = true

            val alphaAnimation = AlphaAnimation(1.0f, 0.2f)
            alphaAnimation.duration = 1000

            val translateAnimation = TranslateAnimation(
                0f,
                100f,
                0f,
                -100f)
            translateAnimation.duration = 1000

            animSet.addAnimation(alphaAnimation)
            animSet.addAnimation(translateAnimation)

            this.image.startAnimation(animSet)
        }

        reverse.setOnClickListener {
            val animation = AlphaAnimation(1.0f, 0.2f)
            animation.duration = 1000
            animation.repeatCount = Animation.INFINITE
            animation.repeatMode = Animation.RESTART

            animation.setAnimationListener(object : Animation.AnimationListener{
                override fun onAnimationRepeat(animation: Animation?) {
                    print("動畫開始")
                }

                override fun onAnimationEnd(animation: Animation?) {
                    print("動畫結束")
                }

                override fun onAnimationStart(animation: Animation?) {
                    print("動畫重新開始")
                }
            })

            animation.cancel()

            this.image.startAnimation(animation)
        }

        translate.setOnClickListener {
            val animation = TranslateAnimation(
                0f,
                600f,
                0f,
                0f)
            animation.duration = 1000
            animation.fillAfter = true
            //animation.interpolator = AccelerateInterpolator() //加速
            //animation.interpolator = DecelerateInterpolator() //減速
            //animation.interpolator = LinearInterpolator() //均速
            //animation.interpolator = OvershootInterpolator() //快速到終點，超過再回到結束位置
            //animation.interpolator = AccelerateDecelerateInterpolator() //先加速在減速
            //animation.interpolator = AnticipateInterpolator() // 先退後再加速前進
            //animation.interpolator = AnticipateOvershootInterpolator() //先退後再加速前進、超過終點後再回到結束樣式
            //animation.interpolator = BounceInterpolator() //快速道最後彈回
            animation.interpolator = CycleInterpolator(3.0f) // 來回彈動
            this.image.startAnimation(animation)
        }
    }
}