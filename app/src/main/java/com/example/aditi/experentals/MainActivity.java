package com.example.aditi.experentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent_mainactivity;
        intent_mainactivity = new Intent(MainActivity.this, AuthActivity.class);
        startActivity(intent_mainactivity);
    }
}
