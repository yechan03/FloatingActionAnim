package com.example.eunwoosong;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private FloatingActionButton fab;
    private Animation animation;
    private BottomNavigationView bottomNavigationView;
    private BottomAppBar appBar;
    private Boolean asd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //animation
        bottomNavigationView = findViewById(R.id.bottomnav_main);
        appBar = findViewById(R.id.bottombar_main);
        animation = AnimationUtils.loadAnimation(this, R.anim.anim);

        button = findViewById(R.id.button);
        fab = findViewById(R.id.fab_main);

        button.setOnClickListener(v-> {

            if (fab.getVisibility()==View.GONE){
                fab.show();
                fab.setVisibility(View.VISIBLE);
            }
            else{
                fab.hide();
                fab.setVisibility(View.GONE);
            }

        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}