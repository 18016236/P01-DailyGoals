package com.example.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DemoActivities2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities2);

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv1 = findViewById(R.id.textView8);
        TextView tv2 = findViewById(R.id.textView9);
        TextView tv3 = findViewById(R.id.textView10);
        TextView tv4 = findViewById(R.id.textView11);

        // Display the name and age on the TextView
        tv1.setText("Read up on materials before class: " + info[1] );
        tv2.setText("Arrive on time so as not to miss important part of the lesson: " + info[2] );
        tv3.setText("Attempt the problem myself: " + info[3] );
        tv4.setText("Reflection: " + info[0] );

    }



}
