package com.dash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_TIME_OUT = 3000;
    TextView mtextview;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextview = findViewById(R.id.mtextview);

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_text);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME_OUT);
        mtextview.startAnimation(animation);

    }
}
