package com.example.jointyearbookredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Start Activity Methods

    public void toDannysYearbook(View v){
        Intent i = new Intent(getApplicationContext(),dannysactivity.class);
        startActivity(i);
    }



    public void toBorasYearbook(View v){
        Intent i = new Intent(getApplicationContext(),borasactivity.class);
        startActivity(i);
    }

 /*Uncomment When you input the Activity .class name
   
    public void toLuthersYearbook(View v){

        Intent i = new Intent(getApplicationContext(),.class);
        startActivity(i);
    }

     */

    //End Activity Methods



}