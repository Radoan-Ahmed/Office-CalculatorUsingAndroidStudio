package com.example.officcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DailyLineTarget extends AppCompatActivity {

    EditText txtHour,txtWorker,txtSAM,txtEfficiency;
    Button btCalculate;
    TextView txtAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_line_target);

        txtHour = findViewById(R.id.txtHour);
        txtWorker = findViewById(R.id.txtWorker);
        txtSAM = findViewById(R.id.txtSAM);
        txtEfficiency = findViewById(R.id.txtEfficiency);
        btCalculate = findViewById(R.id.btCalculate);
        txtAnswer = findViewById(R.id.txtAnswer);

        btCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a,b,c,d,e,g,h;
                a = Double.parseDouble(txtHour.getText().toString());
                b = Double.parseDouble(txtWorker.getText().toString());
                c = Double.parseDouble(txtSAM.getText().toString());
                d = Double.parseDouble(txtEfficiency.getText().toString());
                h = d/100;
                e = a*60.0*h*b;
                g = e/c;
                txtAnswer.setText(String.format("%.1f",g));


            }
        });



    }
}