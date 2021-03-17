package com.example.officcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LabourProductivity extends AppCompatActivity {

    EditText txtLineOutputProduct,txtTotalWorker;
    TextView txtViewAnswer;
    Button btnAnsCalculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labour_productivity);

        txtLineOutputProduct = findViewById(R.id.txtLineOutputProduct);
        txtTotalWorker = findViewById(R.id.txtTotalWorker);
        txtViewAnswer = findViewById(R.id.txtViewAnswer);
        btnAnsCalculate = findViewById(R.id.btnAnsCalculate);

        btnAnsCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a, b, z;
                a = Double.parseDouble(txtLineOutputProduct.getText().toString());
                b = Double.parseDouble(txtTotalWorker.getText().toString());
                z = a / b;
                txtViewAnswer.setText(String.format("Machine Productivity = %.3f", z)+"%");
            }
        });


    }
}

