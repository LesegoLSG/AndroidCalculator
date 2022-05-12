package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText);
    }

    public void btnShow(View view){
        String value = et.getText().toString();

        switch(view.getId()){
            case R.id.btnzero:
                value +="0";
                break;
            case  R.id.btnone:
                value += "1";
                break;
            case R.id.btntwo:
                value +="2";
                break;
            case R.id.btnthree:
                value +="3";
                break;
            case R.id.btnfour:
                value +="4";
                break;
            case R.id.btnfive:
                value +="5";
                break;
            case R.id.btnsix:
                value +="6";
                break;
            case R.id.btnseven:
                value +="7";
                break;
            case R.id.btneight:
                value +="8";
                break;
            case R.id.btnnine:
                value +="9";
                break;

        }
        et.setText(value);
    }
}