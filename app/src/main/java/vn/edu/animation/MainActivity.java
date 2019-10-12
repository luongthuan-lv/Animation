package vn.edu.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imgCar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgCar=findViewById(R.id.imgCar);
    }

    public void Property(View view) {
//        ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(imgCar,"translationX",0,1800f);
//        objectAnimator.setDuration(3000);
//        objectAnimator.setRepeatCount(1000);
//        objectAnimator.setRepeatMode(ValueAnimator.RESTART);
//        objectAnimator.start();

        Animator animation= AnimatorInflater.loadAnimator(this,R.animator.animation);
        animation.setTarget(imgCar);
        animation.start();
    }

    public void View(View view) {
        Intent intent=new Intent(this,SubActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);

    }

    public void Drawble(View view) {
        imgCar.setImageResource(R.drawable.car_run);
        AnimationDrawable animationDrawable= (AnimationDrawable) imgCar.getDrawable();
        animationDrawable.start();
    }
}
