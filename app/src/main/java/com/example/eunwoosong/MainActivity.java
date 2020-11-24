package com.example.eunwoosong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private FloatingActionButton fab;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //animation
        animation = AnimationUtils.loadAnimation(this, R.anim.anim);

        button = findViewById(R.id.button);
        fab = findViewById(R.id.fab_main);

        button.setOnClickListener(v-> {

            if (fab.getVisibility()==View.GONE){

                fab.setVisibility(View.VISIBLE);
                fab.setAnimation(animation);
            }
            else{
                fab.setVisibility(View.GONE);
            }

        });

    }
}