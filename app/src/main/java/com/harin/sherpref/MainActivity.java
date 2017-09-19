package com.harin.sherpref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import harin.com.mylibrary.GetSetPreference;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText enterValue;
    TextView lblString, lblInt, lblBoolean, lblLong, lblFloat;
    Button btnAddString, btnGetString,
            btnAddInt, btnGetInt,
            btnAddBoolean, btnGetBoolean,
            btnAddLong, btnGetLong,
            btnAddFloat, btnGetFloat,
            btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterValue = (EditText) findViewById(R.id.et_value);

        btnAddString = (Button) findViewById(R.id.btn_add_string);
        btnGetString = (Button) findViewById(R.id.btn_get_string);
        lblString = (TextView) findViewById(R.id.lbl_string);

        btnAddInt = (Button) findViewById(R.id.btn_add_int);
        btnGetInt = (Button) findViewById(R.id.btn_get_int);
        lblInt = (TextView) findViewById(R.id.lbl_int);

        btnAddBoolean = (Button) findViewById(R.id.btn_add_boolean);
        btnGetBoolean = (Button) findViewById(R.id.btn_get_boolean);
        lblBoolean = (TextView) findViewById(R.id.lbl_boolean);

        btnAddLong = (Button) findViewById(R.id.btn_add_long);
        btnGetLong = (Button) findViewById(R.id.btn_get_long);
        lblLong = (TextView) findViewById(R.id.lbl_long);

        btnAddFloat = (Button) findViewById(R.id.btn_add_float);
        btnGetFloat = (Button) findViewById(R.id.btn_get_float);
        lblFloat = (TextView) findViewById(R.id.lbl_float);

        btnClear = (Button) findViewById(R.id.btn_clear);

        btnAddString.setOnClickListener(this);
        btnGetString.setOnClickListener(this);

        btnAddInt.setOnClickListener(this);
        btnGetInt.setOnClickListener(this);

        btnAddBoolean.setOnClickListener(this);
        btnGetBoolean.setOnClickListener(this);

        btnAddLong.setOnClickListener(this);
        btnGetLong.setOnClickListener(this);

        btnAddFloat.setOnClickListener(this);
        btnGetFloat.setOnClickListener(this);

        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String test;
        String et;
        switch (v.getId()) {
            case R.id.btn_add_string:
                et = enterValue.getText().toString();
                GetSetPreference.setString(this, "TEST_KEY", et);
                break;
            case R.id.btn_get_string:
                test = GetSetPreference.getString(this, "TEST_KEY");
                lblString.setText(test);
                break;

            case R.id.btn_add_int:
                et = enterValue.getText().toString();
                GetSetPreference.setInt(this,"KEY_INT",Integer.parseInt(et));
                break;
            case R.id.btn_get_int:
                test = GetSetPreference.getString(this, "KEY_INT");
                lblInt.setText(test);
                break;

            case R.id.btn_add_boolean:
                GetSetPreference.setBoolean(this,"KEY_BOOL",true);
                break;
            case R.id.btn_get_boolean:
                test = GetSetPreference.getString(this, "KEY_BOOL");
                lblBoolean.setText(test);
                break;

            case R.id.btn_add_long:
                et = enterValue.getText().toString();
                GetSetPreference.setLong(this,"KEY_LONG",Long.parseLong(et));
                break;
            case R.id.btn_get_long:
                test = GetSetPreference.getString(this, "KEY_LONG");
                lblLong.setText(test);
                break;

            case R.id.btn_add_float:
                et = enterValue.getText().toString();
                GetSetPreference.setFloat(this,"KEY_FLOAT",Float.parseFloat(et));
                break;
            case R.id.btn_get_float:
                test = GetSetPreference.getString(this, "KEY_FLOAT");
                lblFloat.setText(test);
                break;

            case R.id.btn_clear:

                GetSetPreference.ClearAllPreference();

            default:
                break;
        }
    }
}
