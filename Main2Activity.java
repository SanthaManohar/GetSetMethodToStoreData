package com.app.getsetmethodactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView mobilenumber,message;
    Button backbtn,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mobilenumber = findViewById(R.id.mobilenumber);
        message = findViewById(R.id.message);
        backbtn = findViewById(R.id.backbtn);
        reset = findViewById(R.id.resetbtn);

        mobilenumber.setText(GetSet.getMobilenumber());
        message.setText(GetSet.getMessage());

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mobilenumber.setText("");
                message.setText("");
                GetSet.reset();
            }
        });

    }
}
