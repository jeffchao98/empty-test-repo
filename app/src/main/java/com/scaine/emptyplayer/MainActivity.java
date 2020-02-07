package com.scaine.emptyplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.scaine.playercore.HeartCore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HeartCore heartCore = new HeartCore();
        Log.i("datatest", heartCore.getName());
    }
}
