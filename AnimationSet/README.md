# Animation Set
 
## Four animation effect
 * [AlphaAnimation](#alphaAnimation)
 * [TranslateAnimation](#translateAnimation)
 * [ScaleAnimation](#scaleAnimation)
 * [RotateAnimation](#rotateAnimation)

# [AlphaAnimation](https://developer.android.com/reference/android/view/animation/AlphaAnimation)
### Code
    val animation = AlphaAnimation(1.0f, 0.2f)
    animation.duration = 1000
    this.image.startAnimation(animation)
# [TranslateAnimation](https://developer.android.com/reference/android/view/animation/TranslateAnimation)
### Code
    val animation = TranslateAnimation(
        0f,
        100f,
        0f,
        -100f)
    animation.duration = 1000
    this.image.startAnimation(animation)
# [ScaleAnimation](https://developer.android.com/reference/android/view/animation/ScaleAnimation)
### Code
    val animation = ScaleAnimation(
        1.0f,
        1.5f,
        1.0f,
        1.5f,
        Animation.RELATIVE_TO_SELF, 1f,
        Animation.RELATIVE_TO_SELF, 1f)
    animation.duration = 1000        
    imageView.startAnimation
    (AnimationUtils.loadAnimation(this, R.anim.translate))
# [RotateAnimation](https://developer.android.com/reference/android/view/animation/RotateAnimation)
### Code
    val animation = RotateAnimation(
        fromDegree,
        toDegree,
        RotateAnimation.RELATIVE_TO_SELF, 0.5f,
        RotateAnimation.RELATIVE_TO_SELF, 0.5f)
    animation.duration = 1000
    imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))