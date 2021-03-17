package com.example.officcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    TextView first, second, third, fourth, five, six,btClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        fourth = findViewById(R.id.fourth);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        btClick = findViewById(R.id.btClick);

        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
        fourth.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        btClick.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first:
                Toast.makeText(SecondActivity.this, "This is first Toast", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SecondActivity.this, DailyLineTarget.class);
                startActivity(intent);
                break;
            case R.id.second:
                Toast.makeText(SecondActivity.this, "This is second Toast", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(SecondActivity.this, IndividualOperatorTarget.class);
                startActivity(intent2);
                break;

            case R.id.third:
                Toast.makeText(SecondActivity.this,"This is Third Toast",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent1);
                break;

            case R.id.fourth:
                Toast.makeText(SecondActivity.this,"This is Fourth Toast",Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(SecondActivity.this,MachineProductivity.class);
                startActivity(intent3);
                break;

            case R.id.five:
                Toast.makeText(SecondActivity.this,"This is Five Toast",Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(SecondActivity.this,LabourProductivity.class);
                startActivity(intent4);
                break;


            case R.id.six:
                Toast.makeText(SecondActivity.this,"This is six Toast",Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(SecondActivity.this,HourlyProductionTarget.class);
                startActivity(intent5);
                break;

            case R.id.btClick:
                Intent intent6 = new Intent(SecondActivity.this,Formula.class);
                startActivity(intent6);
                break;


        }
    }
}