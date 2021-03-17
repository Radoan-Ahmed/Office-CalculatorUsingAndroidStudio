package com.example.officcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HourlyProductionTarget extends AppCompatActivity {

    EditText editTxtSam;
    TextView textViewAnss;
    Button buttonOfCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_production_target);
        editTxtSam = findViewById(R.id.editTxtSam);
        textViewAnss = findViewById(R.id.textViewAnss);
        buttonOfCalculate = findViewById(R.id.buttonOfCalculate);
        buttonOfCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a,b;
                a = Double.parseDouble(editTxtSam.getText().toString());
                b = 60.0/a;
                textViewAnss.setText(String.format("%.1f",b));
            }
        });

    }
}