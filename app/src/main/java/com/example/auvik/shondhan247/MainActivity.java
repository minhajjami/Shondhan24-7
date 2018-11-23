package com.example.auvik.shondhan247;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button police = (Button)findViewById(R.id.policebtn);

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,PoliceActivity.class));
            }
        });

        Button fireservice = (Button)findViewById(R.id.firebtn);

        fireservice.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,FireActivity.class));
            }
        });

        Button hospital = (Button)findViewById(R.id.hosbtn);

        hospital.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HospitalActivity.class));
            }
        });

        Button bloodbank = (Button)findViewById(R.id.bloodbtn);

        bloodbank.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BloodActivity.class));
            }
        });
    }
}
