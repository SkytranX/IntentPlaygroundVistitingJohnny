package com.example.intentplayground;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class Activity_B extends AppCompatActivity{
   ImageView johnny;
   Intent catalinaWHineMixer;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bscreen);

        johnny = findViewById(R.id.image_view);

        catalinaWHineMixer = getIntent();


        String getNoodles =    catalinaWHineMixer.getStringExtra("sendNoodles");
        Toast.makeText(this, getNoodles , Toast.LENGTH_SHORT).show();

    }


}
