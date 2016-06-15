package com.bryonnicoson.activecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Intent mIntendToAdd;
    private Intent mIntendToSubtract;
    private Intent mIntendToMultiply;
    private Intent mIntendToDivide;
    private Intent mIntendToFactorialize;
    private Intent mIntendToPrime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_add = (Button) findViewById(R.id.btn_add);
        mIntendToAdd = new Intent(MainActivity.this, Add.class);

        View.OnClickListener listenerAdd = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN", "Click btn_add");
                startActivity(mIntendToAdd);
            }
        };
        btn_add.setOnClickListener(listenerAdd);

        Button btn_subtract = (Button) findViewById(R.id.btn_subtract);
        mIntendToSubtract = new Intent(MainActivity.this, Subtract.class);

        View.OnClickListener listenerSubtract = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN", "Click btn_subtract");
                startActivity(mIntendToSubtract);
            }
        };
        btn_subtract.setOnClickListener(listenerSubtract);

        Button btn_multiply = (Button) findViewById(R.id.btn_multiply);
        mIntendToMultiply = new Intent(MainActivity.this, Multiply.class);

        View.OnClickListener listenerMultiply = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN", "Click btn_multiply");
                startActivity(mIntendToMultiply);
            }
        };
        btn_multiply.setOnClickListener(listenerMultiply);


        Button btn_divide = (Button) findViewById(R.id.btn_divide);
        mIntendToDivide = new Intent(MainActivity.this, Divide.class);

        View.OnClickListener listenerDivide = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN", "Click btn_divide");
                startActivity(mIntendToDivide);
            }
        };
        btn_divide.setOnClickListener(listenerDivide);

        Button btn_factorialize = (Button) findViewById(R.id.btn_factorial);
        mIntendToFactorialize = new Intent(MainActivity.this, Factorial.class);

        View.OnClickListener listenerFactorial = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN", "Click btn_divide");
                startActivity(mIntendToFactorialize);
            }
        };
        btn_factorialize.setOnClickListener(listenerFactorial);

        Button btn_prime = (Button) findViewById(R.id.btn_prime);
        mIntendToPrime = new Intent(MainActivity.this, Prime.class);

        View.OnClickListener listenerPrime = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN", "Click btn_prime");
                startActivity(mIntendToPrime);
            }
        };
        btn_prime.setOnClickListener(listenerPrime);
    }
}
