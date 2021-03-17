package com.example.officcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MachineProductivity extends AppCompatActivity {

    EditText txtLineOutput,txtUsedMachine;
    TextView txtViewAns;
    Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_productivity);
        txtLineOutput = findViewById(R.id.txtLineOutputProduct);
        txtUsedMachine = findViewById(R.id.txtUsedMachine);
        txtViewAns = findViewById(R.id.txtViewAnswer);
        buttonCalculate = findViewById(R.id.buttonCalculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a,b,z;
                a = Double.parseDouble(txtLineOutput.getText().toString());
                b = Double.parseDouble(txtUsedMachine.getText().toString());
                z = a/b;
                txtViewAns.setText(String.format("Machine Productivity = %.3f",z)+"%");
            }
        });


    }
}