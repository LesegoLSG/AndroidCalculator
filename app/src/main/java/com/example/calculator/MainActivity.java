package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btnPerc;
    Button btnAC;
    boolean isCliecked=true;
    String operator;
    String oldValue;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editText);
        et.setFocusable(false);
        et.setClickable(false);
        btnPerc = findViewById(R.id.btnpercent);
        btnAC = findViewById(R.id.btnAC);
        cancel();
    }

    public void btnShow(View view){
        if(isCliecked) {
            et.setText("");
            isCliecked=false;
        }

        value = et.getText().toString();
        double perValue;
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
            case R.id.btnDot:
                value +=".";
                break;
            case R.id.btnPlusMinus:
                value ="-"+value;
                break;

        }

        et.setText(value);
        
    }
    public void operation(View view) {
        isCliecked=true;
        oldValue = et.getText().toString();
        switch (view.getId()) {
            case R.id.btnPlus:
                operator = "+";
                break;
            case R.id.btnMinus:
                operator = "-";
                break;
            case R.id.btnMultiply:
                operator = "*";
                break;
            case R.id.btnDivide:
                operator = "/";
                break;
        }
        et.setText(value + operator);


    }

    public void equalbtn(View view){
        String newValue = et.getText().toString();
        double results = 0.0;
        switch(operator){
            case "+" :
                results = Double.parseDouble(oldValue) + Double.parseDouble(newValue);
                break;
            case "-" :
                results = Double.parseDouble(oldValue) - Double.parseDouble(newValue);
                break;
            case "*" :
                results = Double.parseDouble(oldValue) * Double.parseDouble(newValue);
                break;
            case "/" :
                results = Double.parseDouble(oldValue) / Double.parseDouble(newValue);
                break;
        }
        et.setText(results+"");
    }
    public void cancel(){
        btnAC.setOnClickListener(e ->{
            et.setText("");
        });
    }






}