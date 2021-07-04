# LottieAnimation
 Animation Library 사용법 기록용
 ---

* 1. build.gradle 적용 (최신 버전 확인)
 [Lottie-Android][link]

[link]: https://github.com/airbnb/lottie-android


```gradle
 //로티 애니메이션
     implementation 'com.airbnb.android:lottie:$lottieVersion'
```

* 2. 애니메이션 파일 다운로드(.json)
[LottieFiles][link]

[link]: https://lottiefiles.com/


* 3. 뷰 적용
```xml
<com.airbnb.lottie.LottieAnimationView
        android:id="@+id/animation_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"

        app:lottie_rawRes="@raw/hello_world"
        // or
        app:lottie_fileName="hello_world.json"

        // Loop indefinitely
        app:lottie_loop="true"
        // Start playing as soon as the animation is loaded
        app:lottie_autoPlay="true" />
```
        
* 4. 뷰 커스텀
```java
// Custom animation speed or duration.
val animator = ValueAnimator.ofFloat(0f, 1f)
animator.addUpdateListener {
    animationView.setProgress(animation.animatedValue)
}
animator.start()
```

#### 적용 모습
<img src="https://ifh.cc/g/TiCpFz.jpg" width="20%" height="15%"></img>
클릭 시 활성화
<img src="https://ifh.cc/g/JVOH26.jpg" width="20%" height="15%"></img>
클릭 시 비활성화



###### 참조
https://airbnb.io/lottie/#/android

[LottieFiles][link]

[link]: https://lottiefiles.com/

[Lottie-Android][link] (github)

[link]: https://github.com/airbnb/lottie-android
