package com.bryonnicoson.activecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prime extends AppCompatActivity {

    private EditText mNumber;
    private TextView mIsPrime;
    private Button mButton;
    private int a;
    private String isPrime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);

        mNumber = (EditText)findViewById(R.id.edit_number);
        mIsPrime = (TextView)findViewById(R.id.txt_is_prime);
        mButton = (Button)findViewById(R.id.btn_calc_is_prime);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isPrime = "is prime.";
                Log.i("PRIME", "Click btn_calc_is_prime");
                a = Integer.parseInt(mNumber.getText().toString());

                if (a % 2 == 0) isPrime = "is not prime.";
                for (int i = 3; i * i <= a; i += 2) {
                    if (a % i == 0) isPrime = "is not prime.";
                }

                mIsPrime.setText("The number " + Integer.toString(a) + " " + isPrime);
            }
        };

        mButton.setOnClickListener(listener);
    }

}
