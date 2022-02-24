package com.example.jointyearbookredo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class lutheractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lutheractivity);

        Button btn = (Button) findViewById(R.id.btnChange);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView mTextView = (TextView) findViewById(R.id.textView);
                mTextView.setText("Button as been clicked.");
            }

        });


    }

    public void tolutheractivity2(View v){
        Intent i = new Intent(getApplicationContext(), lutheractivity2.class);
        startActivity(i);
    }




}