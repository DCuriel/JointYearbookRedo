package com.example.jointyearbookredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class borasactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.borasactivity);
    }

    /*public void changeText(View v){
        //v.setEnabled(false);
        Button button = (Button) v;
        button.setText("Change Text");
    }

    public void sendMessage(View view) {

    }*/

    public void toBorasActivity2(View v){
        Intent i = new Intent(getApplicationContext(),borasactivity2.class);
        startActivity(i);
    }

    public void toMainPage(View v){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }

}
