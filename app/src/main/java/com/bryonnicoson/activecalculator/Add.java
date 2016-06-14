package com.bryonnicoson.activecalculator;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Add extends AppCompatActivity {

    private EditText mEditAugend;
    private EditText mEditAddend;
    private TextView mSum;
    private Button mButton;
    private double a;
    private double b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        mEditAugend = (EditText)findViewById(R.id.edit_augend);
        mEditAddend = (EditText)findViewById(R.id.edit_addend);
        mSum = (TextView)findViewById(R.id.txt_sum);
        mButton = (Button)findViewById(R.id.btn_calc_sum);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("ADD", "Click btn_add");
                a = Double.parseDouble(mEditAugend.getText().toString());
                b = Double.parseDouble(mEditAddend.getText().toString());
                mSum.setText(a + b + "");
            }
        };

        mButton.setOnClickListener(listener);

    }
}
