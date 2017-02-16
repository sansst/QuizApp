package com.example.daniel.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = getIntent().getExtras().getInt("result");

        TextView TV = (TextView) findViewById(R.id.textViewResult);
        TV.setText(getString(R.string.result1) + ' ' + Integer.toString(result) + ' ' + getString(R.string.result2));

    }

    public void ButtonReset(View view) {
        Intent i = new Intent(this, QuestionsActivity.class);
        startActivity(i);
    }
}
