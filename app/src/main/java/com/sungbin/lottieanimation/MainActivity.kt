package com.sungbin.lottieanimation

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sungbin.lottieanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    var isLiked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.run {
            likeBtn.setOnClickListener {
                if (!isLiked) { // 애니메이션 활성화 되기 전
                    val animator = ValueAnimator.ofFloat(0f, 0.5f).setDuration(1000)
                    //onFloat(시작, 종료 지점).setDuration(지속시간)
                    animator.addUpdateListener {
                        likeBtn.setProgress(
                            animator.getAnimatedValue() as Float
                        )
                    }
                    animator.start()
                    isLiked = true
                }else{          // 애니메이션 활성화 된 후
                    val animator = ValueAnimator.ofFloat(0.5f, 1f).setDuration(1000)
                    //onFloat(시작, 종료 지점).setDuration(지속시간)
                    animator.addUpdateListener {
                        likeBtn.setProgress(
                            animator.getAnimatedValue() as Float
                        )
                    }
                    animator.start()
                    isLiked = false
                }
            }
        }
    }
}