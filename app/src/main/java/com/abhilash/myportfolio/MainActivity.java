package com.abhilash.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button subApp1,subApp2,subApp3,subApp4,subApp5,subApp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subApp1 = (Button) findViewById(R.id.app1);
        subApp2 = (Button) findViewById(R.id.app2);
        subApp3 = (Button) findViewById(R.id.app3);
        subApp4 = (Button) findViewById(R.id.app4);
        subApp5 = (Button) findViewById(R.id.app5);
        subApp6 = (Button) findViewById(R.id.app6);

        subApp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+getText(R.string.toastMessage)+" "+getText(R.string.sub_app1)+" "+getText(R.string.app), Toast.LENGTH_SHORT).show();
            }
        });

        subApp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+getText(R.string.toastMessage)+" "+getText(R.string.sub_app2)+" "+getText(R.string.app), Toast.LENGTH_SHORT).show();
            }
        });

        subApp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+getText(R.string.toastMessage)+" "+getText(R.string.sub_app3)+" "+getText(R.string.app), Toast.LENGTH_SHORT).show();
            }
        });

        subApp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+getText(R.string.toastMessage)+" "+getText(R.string.sub_app4)+" "+getText(R.string.app), Toast.LENGTH_SHORT).show();
            }
        });

        subApp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+getText(R.string.toastMessage)+" "+getText(R.string.sub_app5)+" "+getText(R.string.app), Toast.LENGTH_SHORT).show();
            }
        });

        subApp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+getText(R.string.toastMessage)+" "+getText(R.string.sub_app6)+" "+getText(R.string.app), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
