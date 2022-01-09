package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity {

    Button signinEmail, signinPhone, signUp;
    ImageView bgImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final Animation zoomin = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        final Animation zoomout = AnimationUtils.loadAnimation(this, R.anim.zoomout);

        bgImage = findViewById(R.id.back2);
        bgImage.setAnimation(zoomin);
        bgImage.setAnimation(zoomin);

        zoomout.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bgImage.startAnimation(zoomin);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        zoomout.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                bgImage.startAnimation(zoomout);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        signinEmail = (Button) findViewById(R.id.signWithEmail);
        signinPhone = (Button) findViewById(R.id.signWithPhone);
        signUp = (Button) findViewById(R.id.signUp);

        signinEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signemail = new Intent(MainMenu.this, ChooseOne.class);
                signemail.putExtra("Home", "Email");
                startActivity(signemail);
                finish();
            }
        });

        signinPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signephone = new Intent(MainMenu.this, ChooseOne.class);
                signephone.putExtra("Home", "Phone");
                startActivity(signephone);
                finish();
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(MainMenu.this, ChooseOne.class);
                signup.putExtra("Home", "SignUp");
                startActivity(signup);
                finish();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.gc();
    }
}