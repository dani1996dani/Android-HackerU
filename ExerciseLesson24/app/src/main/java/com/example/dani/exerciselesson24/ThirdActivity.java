package com.example.dani.exerciselesson24;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends Activity {

    public static final String GOING_TO = "goingTo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }


    public void goToFirst(View view) {
        Intent data = new Intent();
        data.putExtra(GOING_TO, 1);
        setResult(RESULT_OK, data);
        finish();
    }

    public void goToSecond(View view) {
        Intent data = new Intent();
        data.putExtra(GOING_TO, 2);
        setResult(RESULT_OK, data);
        finish();

    }
}
