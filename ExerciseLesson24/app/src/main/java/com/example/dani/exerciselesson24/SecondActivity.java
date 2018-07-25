package com.example.dani.exerciselesson24;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.dani.exerciselesson24.ThirdActivity.*;

public class SecondActivity extends Activity {

    public static final int THREE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        int to = getIntent().getIntExtra("to", -1);

        if (to == 3) {

            Intent intent = new Intent(this, ThirdActivity.class);
            startActivityForResult(intent, THREE);

        }

    }

    public void goToFirst(View view) {
        finish();
    }

    public void goToThird(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivityForResult(intent, THREE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == THREE) {
            if (resultCode == RESULT_OK) {
                int goingTo = data.getIntExtra(GOING_TO, -1);
                if (goingTo == 1)
                    finish();
            }
        }
    }
}
