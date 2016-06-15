package com.bryonnicoson.activecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Factorial extends AppCompatActivity {

    private EditText mEditNumber;
    private TextView mFactorial;
    private Button mButton;
    private double a;
    private int i;
    private int factorial = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        mEditNumber = (EditText)findViewById(R.id.edit_number);
        mFactorial = (TextView)findViewById(R.id.txt_factorial);
        mButton = (Button)findViewById(R.id.btn_calc_factorial);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("ADD", "Click btn_calc_difference");
                a = Double.parseDouble(mEditNumber.getText().toString());
                for (i = 1; i <= a; i++) {
                    factorial = factorial*i;
                }
                mFactorial.setText(factorial + "");
            }
        };

        mButton.setOnClickListener(listener);



    }
}
