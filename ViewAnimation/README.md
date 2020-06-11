# View Animation

## Four animation effect
 * [alpha](#alpha)
 * [translate](#translate)
 * [scale](#scale)
 * [rotate](#rotate)

# alpha
>## android:duration
>## android:fromAlpha
>## android:toAlpha
## Example
### alpha.xml
    <?xml version="1.0" encoding="utf-8"?>
    <set xmlns:android="http://schemas.android.com/apk/res/android">
        <alpha
            android:duration="2000"
            android:fromAlpha="1.0"
            android:toAlpha="0" />
    </set>
### Code
    imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.alpha))
# translate
>## android:duration
>## android:fromXDelta
>## android:toXDelta
>## android:fromYDelta
>## android:toYDelta
## Example
### translate.xml
    <?xml version="1.0" encoding="utf-8"?>
    <set xmlns:android="http://schemas.android.com/apk/res/android">
        <translate
            android:duration="2000"
            android:fromXDelta="0"
            android:toXDelta="0"
            android:toYDelta="0"
            android:toXDelta="100%"
            android:toYDelta="100%" />
    </set>
### Code
    imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate))
# scale
>## android:duration
>## android:fromXScale
>## android:toXScale
>## android:fromYScale
>## android:toYScale
>## android:pivotX
>## android:pivotY
## scale.xml
    <?xml version="1.0" encoding="utf-8"?>
    <set xmlns:android="http://schemas.android.com/apk/res/android">
        <scale
            android:duration="2000"
            android:fromXScale="1.0"
            android:fromYScale="1.0"
            android:toXScale="3.0"
            android:toYScale="3.0"
            android:pivotX="50%"
            android:pivotY="50%" />
    </set>
### Code
    imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.translate))
# rotate
>## android:duration
>## android:fromDegrees
>## android:toDegrees
>## android:pivotX
>## android:pivotY
## Example
### rotate.xml
    <?xml version="1.0" encoding="utf-8"?>
    <set xmlns:android="http://schemas.android.com/apk/res/android">
        <rotate
            android:duration="2000"
            android:fromDegrees="0"
            android:toDegrees="720"
            android:pivotX="50%"
            android:pivotY="50%" />
    </set>
### Code
    imageView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))