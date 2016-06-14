package com.bryonnicoson.activecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Subtract extends AppCompatActivity {

    private EditText mEditMinuend;
    private EditText mEditSubtrahend;
    private TextView mDifference;
    private Button mButton;
    private double a;
    private double b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtract);

        mEditMinuend = (EditText)findViewById(R.id.edit_minuend);
        mEditSubtrahend = (EditText)findViewById(R.id.edit_subtrahend);
        mDifference = (TextView)findViewById(R.id.txt_difference);
        mButton = (Button)findViewById(R.id.btn_calc_difference);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("SUBTRACT", "Click btn_calc_difference");
                a = Double.parseDouble(mEditMinuend.getText().toString());
                b = Double.parseDouble(mEditSubtrahend.getText().toString());
                mDifference.setText(a - b + "");
            }
        };

        mButton.setOnClickListener(listener);
    }
}
