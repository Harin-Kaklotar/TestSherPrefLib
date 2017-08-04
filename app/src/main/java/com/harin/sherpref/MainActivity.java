package com.harin.sherpref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import harin.com.mylibrary.GetSetPreference;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView helloWorld;
    Button btnAddString, btnGetString, btnAddInt, btnGetInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorld = (TextView) findViewById(R.id.lbl_hello_world);
        helloWorld.setText("Hello Harin, welcome to version control !!!");


        btnAddString = (Button) findViewById(R.id.btn_add_string);
        btnGetString = (Button) findViewById(R.id.btn_get_string);
        btnAddInt = (Button) findViewById(R.id.btn_add_int);
        btnGetInt = (Button) findViewById(R.id.btn_get_int);

        btnAddString.setOnClickListener(this);
        btnGetString.setOnClickListener(this);
        btnAddInt.setOnClickListener(this);
        btnGetInt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add_string:

                GetSetPreference.setString(this, "TEST_KEY", "Harin");

                break;
            case R.id.btn_get_string:

                String test = GetSetPreference.getString(this, "TEST_KEY");
                helloWorld.setText(test);

                break;
            case R.id.btn_add_int:

                break;
            case R.id.btn_get_int:

                break;
            default:
                break;
        }
    }
}
