package com.example.officcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        Thread thread = new Thread(){

            public void run(){

                try {

                    sleep(1000);

                }
                catch (Exception e){
                    e.printStackTrace();

                }
                finally {

                    Intent intent = new Intent(FirstPage.this, SecondActivity.class);
                    startActivity(intent);
                    finish();


                }

            }

        };thread.start();



    }
}