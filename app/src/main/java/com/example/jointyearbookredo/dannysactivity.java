package com.example.jointyearbookredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.FileOutputStream;


public class dannysactivity extends AppCompatActivity {

    ImageView image;
    Button shareBtn;
    BitmapDrawable drawable;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dannysactivity);

        image = findViewById(R.id.SLOP3);
        shareBtn = findViewById(R.id.shareBtn);

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareImage();
            }
        });

    }
        private void shareImage() {
            StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
            StrictMode.setVmPolicy(builder.build());
            drawable = (BitmapDrawable) image.getDrawable();
            bitmap = drawable.getBitmap();
            File file = new File(getExternalCacheDir()+"/"+"SLOP3"+".png");
            Intent intent;
            try {
                FileOutputStream outputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100,outputStream);
                outputStream.flush();
                outputStream.close();
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("image/*");
                intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            }catch (Exception e){
                throw new RuntimeException(e);

            }
            startActivity(Intent.createChooser(intent,"Share image Via"));
    }


        public void changeText (View v){
            //v.setEnabled(false);
            Button button = (Button) v;
            button.setText("Change Text");
        }

        public void sendMessage (View view){

        }

        public void toDannysActivity2 (View v){
            Intent i = new Intent(getApplicationContext(), dannysactivity2.class);
            startActivity(i);
        }
    }