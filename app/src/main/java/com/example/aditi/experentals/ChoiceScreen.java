package com.example.aditi.experentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ChoiceScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_screen);

        final Button button_give = findViewById(R.id.give_button);
        final Button button_take = findViewById(R.id.take_button);

        button_give.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent_give;
                intent_give = new Intent(ChoiceScreen.this, PutforRent.class);
                startActivity(intent_give);
            }
        });

        button_take.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent_take;
                intent_take = new Intent(ChoiceScreen.this, SearchStuff.class);
                startActivity(intent_take);
            }
        });

    }

}
