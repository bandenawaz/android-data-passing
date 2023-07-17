package com.sveri.datapassingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvName, tvMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvName = findViewById(R.id.textViewName);
        tvMsg = findViewById(R.id.textViewMsg);

        tvName.setText(getIntent().getExtras().getString("Name"));
        tvMsg.setText(getIntent().getExtras().getString("Message"));


    }
}