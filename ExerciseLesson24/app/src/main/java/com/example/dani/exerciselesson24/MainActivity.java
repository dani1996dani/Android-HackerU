package com.example.dani.exerciselesson24;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSecond(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("to", 2);//For uniformity
        startActivity(intent);

    }

    public void goToThird(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("to", 3);
        startActivity(intent);
    }
}
