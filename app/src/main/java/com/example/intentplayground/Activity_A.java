package com.example.intentplayground;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_A extends AppCompatActivity implements View.OnClickListener {
   Button switchMe;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        switchMe = findViewById(R.id.switch_Me);
        switchMe.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.switch_Me:
                Intent ie = new Intent(this, Activity_C.class);
                startActivity(ie);
                break;

        }
    }

}
