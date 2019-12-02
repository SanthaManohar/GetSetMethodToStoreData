package com.app.getsetmethodactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mobilenumber,message;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobilenumber = findViewById(R.id.mobilenumber);
        message = findViewById(R.id.message);
        save = findViewById(R.id.save);
        save.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String mobilestr = mobilenumber.getText().toString();
        String messagestr = message.getText().toString();
        if(mobilestr != null && !mobilestr.equals("") && messagestr != null && !messagestr.equals(""))
        {
            GetSet.setMobilenumber(mobilestr);
            GetSet.setMessage(messagestr);
            mobilenumber.setText("");
            message.setText("");
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Please fill all fields..", Toast.LENGTH_SHORT).show();
        }


    }
}
