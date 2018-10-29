package com.example.hp1.asproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CameraGalleryActivity extends AppCompatActivity implements View.OnClickListener{
    Button camera,gallery;
    ImageView imageView2;
    public static final int CAMERA_REQUEST = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_gallery);
        camera = (Button) findViewById(R.id.camera);
        camera.setOnClickListener(this);
        gallery=(Button) findViewById(R.id.gallery);
        gallery.setOnClickListener(this);
        imageView2 =(ImageView) findViewById(R.id.cameraImageView);
    }

    @Override
    public void onClick(View view) {
        if(view==camera){
            Intent i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i,CAMERA_REQUEST);

        }
        else{

            //later
        }
    }

    public void onActivityResult(int requestCode , int resultCode , Intent data){
  //      if (resultCode== CAMERA_REQUEST && resultCode == Activity.RESULT_OK){
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView2 .setImageBitmap(photo);
            Toast.makeText(this, "inside set photo", Toast.LENGTH_LONG).show();
   //     }
    }
}

