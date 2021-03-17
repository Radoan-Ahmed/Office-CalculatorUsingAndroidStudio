package com.example.officcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtManPower,txtSmv,txtOutput,txtWorkingHour;
    TextView txtAns;
    Button btAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtManPower = findViewById(R.id.txtManPower);
        txtSmv = findViewById(R.id.txtSmv);
        txtOutput = findViewById(R.id.txtOutput);
        txtWorkingHour = findViewById(R.id.txtWorkingHour);
        txtAns = findViewById(R.id.txtAnswer);
        btAns = findViewById(R.id.btAns);

        btAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a,b,c,d,x,y,z;
                a = Double.parseDouble(txtManPower.getText().toString());
                b = Double.parseDouble(txtSmv.getText().toString());
                c = Double.parseDouble(txtOutput.getText().toString());
                d = Double.parseDouble(txtWorkingHour.getText().toString());

                x = (b*c*100.0);
                y = a*d*60.0;
                z = x/y;
                txtAns.setText(String.format("Efficiency = %.0f",z)+"%");

            }
        });


    }
}