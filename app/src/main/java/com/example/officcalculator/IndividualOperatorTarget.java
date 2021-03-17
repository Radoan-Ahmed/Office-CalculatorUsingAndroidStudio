package com.example.officcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IndividualOperatorTarget extends AppCompatActivity {

    EditText txtProduced,txtOperationSam,txtMinutes;
    TextView textAns;
    Button buttonAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_operator_target);
        txtProduced = findViewById(R.id.txtProduced);
        txtOperationSam = findViewById(R.id.txtOperationSam);
        txtMinutes = findViewById(R.id.txtMinutes);
        textAns = findViewById(R.id.textAns);
        buttonAns = findViewById(R.id.buttonAns);

        buttonAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a,b,c,d,e,f;
                a = Double.parseDouble(txtProduced.getText().toString());
                b = Double.parseDouble(txtOperationSam.getText().toString());
                c = Double.parseDouble(txtMinutes.getText().toString());
                d = a*b*100.0;
                e = c*60;
                f = d/e;
                textAns.setText(String.format("%.0f",f)+"%");

            }
        });

    }
}