package com.sveri.datapassingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declaration
    EditText etName, etMsg;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisation
        etName = findViewById(R.id.editTextTextName);
        etMsg = findViewById(R.id.editTextTextMessage);

        btnSend = findViewById(R.id.buttonSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("Name",etName.getText().toString());
                i.putExtra("Message", etMsg.getText().toString());
                startActivity(i);

                etName.setText(null);
                etMsg.setText(null);
            }
        });
    }
}