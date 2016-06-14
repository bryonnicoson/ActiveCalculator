package com.bryonnicoson.activecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Divide extends AppCompatActivity {

    private EditText mEditDividend;
    private EditText mEditDivisor;
    private TextView mQuotient;
    private Button mButton;
    private double a;
    private double b;
    private double c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);

        mEditDividend = (EditText)findViewById(R.id.edit_dividend);
        mEditDivisor = (EditText)findViewById(R.id.edit_divisor);
        mQuotient = (TextView)findViewById(R.id.txt_quotient);
        mButton = (Button)findViewById(R.id.btn_calc_quotient);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("ADD", "Click btn_calc_difference");
                a = Double.parseDouble(mEditDividend.getText().toString());
                b = Double.parseDouble(mEditDivisor.getText().toString());
                c = a / b;
                mQuotient.setText(c + "");
            }
        };

        mButton.setOnClickListener(listener);
    }
}
