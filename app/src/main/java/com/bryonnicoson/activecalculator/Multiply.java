package com.bryonnicoson.activecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Multiply extends AppCompatActivity {

    private EditText mEditMultiplicand;
    private EditText mEditMultiplier;
    private TextView mProduct;
    private Button mButton;
    private double a;
    private double b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply);

        mEditMultiplicand = (EditText)findViewById(R.id.edit_multiplicand);
        mEditMultiplier = (EditText)findViewById(R.id.edit_multiplier);
        mProduct = (TextView)findViewById(R.id.txt_product);
        mButton = (Button)findViewById(R.id.btn_calc_product);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("ADD", "Click btn_calc_difference");
                a = Double.parseDouble(mEditMultiplicand.getText().toString());
                b = Double.parseDouble(mEditMultiplier.getText().toString());
                mProduct.setText(a * b + "");
            }
        };

        mButton.setOnClickListener(listener);
    }
}
