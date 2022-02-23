package com.example.jointyearbookredo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("My notification", "My notification", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);

        }
        
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "My notification")
                .setSmallIcon(R.drawable.slop3)
                .setContentTitle("Hello")
                .setContentText("How was your day?")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setAutoCancel(true);
        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        managerCompat.notify(1,builder.build());

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