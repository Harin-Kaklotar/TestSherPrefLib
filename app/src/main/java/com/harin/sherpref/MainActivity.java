package com.harin.sherpref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView helloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorld = (TextView) findViewById(R.id.lbl_hello_world);
        helloWorld.setText("Hello Harin, welcome to version control !!!");
    }
}
