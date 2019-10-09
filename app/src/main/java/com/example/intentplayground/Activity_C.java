package com.example.intentplayground;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_C extends AppCompatActivity implements View.OnClickListener {
    Button switchToast;
    Button runbtn;
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door);

        switchToast = findViewById(R.id.switch_Toast_Me);
        switchToast.setOnClickListener(this);

        runbtn = findViewById(R.id.send_Me);
        runbtn.setOnClickListener(this);

        editText = findViewById(R.id.edtxt);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.switch_Toast_Me:
                String sendNoodles = editText.getText().toString();
                Intent i = new Intent(this, Activity_B.class);
                i.putExtra("sendNoodles", sendNoodles);
                startActivity(i);
                break;

            case R.id.send_Me:
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://media0.giphy.com/media/IwYXRW8IXRftS/source.gif"));
                startActivity(intent);
        }
    }
}
