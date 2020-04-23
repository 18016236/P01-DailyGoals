package com.example.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // Get the RadioGroup object
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup rs = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup rd = (RadioGroup) findViewById(R.id.radioGroup3);

                // Get the EditText that user keys in name
                EditText etReflection = (EditText) findViewById(R.id.editText);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId = rg.getCheckedRadioButtonId();
                int selectedButtonIds = rs.getCheckedRadioButtonId();
                int selectedButtonIda = rd.getCheckedRadioButtonId();

                // Get the radio button object from the Id we had gotten above
                RadioButton rb = (RadioButton) findViewById(selectedButtonId);
                RadioButton rbs = (RadioButton) findViewById(selectedButtonIds);
                RadioButton rbsq = (RadioButton) findViewById(selectedButtonIda);

                // Put the name and age into an array
                String[] info = {etReflection.getText().toString(),rb.getText().toString(),rbs.getText().toString(),rbsq.getText().toString()
                };
                // Create an intent to start another activity called
                //  DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this,
                        DemoActivities2.class);

                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);


            }});







    }
}
