package com.example.pd_liu.screenshot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void capture(View view) {
        startActivity(new Intent(this,CaptureActivity.class));
    }

    public void capture2(View view) {
        startActivity(new Intent(this,Capture2Activity.class));
    }
}
