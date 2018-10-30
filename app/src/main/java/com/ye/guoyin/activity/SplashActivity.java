package com.ye.guoyin.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

import com.ye.guoyin.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // 获取闪屏页布局文件【根据布局文件的 android:id 】
        RelativeLayout splash_layout = findViewById(R.id.splash_layout);

        // 旋转动画
        RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(1000);  // 设置动画持续时间，设为一秒钟
        rotateAnimation.setFillAfter(true);  // 设置动画结束后是否保持最终状态，设为true
        rotateAnimation.setRepeatMode(Animation.REVERSE);  // 设置重复执行的模式，本次设为反转模式，即：从前一次的尾部开始倒回去执行下一个循环的动画。
        rotateAnimation.setRepeatCount(1);  // 设置重复执行动画的次数，本次设为1，也就是执行两次动画。

        //缩放动画
        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1,
                Animation.RELATIVE_TO_SELF,0.5f,
                Animation.RELATIVE_TO_PARENT,0.5f);
        scaleAnimation.setDuration(1000);  // 设置动画持续时间，设为一秒钟
        scaleAnimation.setFillAfter(true);  // 设置动画结束后是否保持最终状态，设为true
        scaleAnimation.setRepeatMode(Animation.REVERSE);  // 设置重复执行的模式，本次设为反转模式，即：从前一次的尾部开始倒回去执行下一个循环的动画。
        scaleAnimation.setRepeatCount(1);  // 设置重复执行动画的次数，本次设为1，也就是执行两次动画。

        // 渐变动画
        AlphaAnimation alphaAnimation = new AlphaAnimation(0,1);
        alphaAnimation.setDuration(2000);  // 设置动画持续时间，设为两秒钟
        alphaAnimation.setFillAfter(true);  // 设置动画结束后是否保持最终状态，设为true
        alphaAnimation.setRepeatMode(Animation.REVERSE);  // 设置重复执行的模式，本次设为反转模式，即：从前一次的尾部开始倒回去执行下一个循环的动画。
        alphaAnimation.setRepeatCount(1);  // 设置重复执行动画的次数，本次设为1，也就是执行两次动画。

        // 创建动画集合，将上面的旋转、缩放、渐变动画，关联成一个整体，同时进行动画演示
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);


        // 启动动画
        splash_layout.startAnimation(animationSet);
    }
}
