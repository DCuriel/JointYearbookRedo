package com.example.jointyearbookredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class borasactivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.borasactivity2);
    }

    public void toMainPage(View v){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}
