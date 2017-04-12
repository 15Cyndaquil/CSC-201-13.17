package com.cynda.csc_201_1317;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initializing Fields

        final Button addBT = (Button) findViewById(R.id.addBT);
        final Button subBT = (Button) findViewById(R.id.subBT);
        final Button multBT = (Button) findViewById(R.id.multBT);
        final Button divideBT = (Button) findViewById(R.id.divideBT);
        final Button abs1BT = (Button) findViewById(R.id.abs1BT);
        final Button abs2BT = (Button) findViewById(R.id.abs2BT);

        final EditText realNum1 = (EditText) findViewById(R.id.realNum1);
        final EditText realNum2 = (EditText) findViewById(R.id.realNum2);

        final EditText imagNum1 = (EditText) findViewById(R.id.imagNum1);
        final EditText imagNum2 = (EditText) findViewById(R.id.imagNum2);

        final TextView outputTV = (TextView) findViewById(R.id.outputTV);


        //Button Actions

        //Addition button

        addBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!realNum1.getText().toString().equals("") &&!realNum2.getText().toString().equals(" ") &&!imagNum1.getText().toString().equals(" ") &&!imagNum2.getText().toString().equals(" ")){
                    Complex num1 = new Complex(Double.parseDouble(realNum1.getText().toString()), Double.parseDouble(imagNum1.getText().toString()));
                    Complex num2 = new Complex(Double.parseDouble(realNum2.getText().toString()), Double.parseDouble(imagNum2.getText().toString()));

                    outputTV.setText(num1.add(num2));
                }else {
                    outputTV.setText(R.string.all_num_input);
                }
            }
        });

        //Subtraction Button

        subBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!realNum1.getText().toString().equals("") &&!realNum2.getText().toString().equals(" ") &&!imagNum1.getText().toString().equals(" ") &&!imagNum2.getText().toString().equals(" ")){
                    Complex num1 = new Complex(Double.parseDouble(realNum1.getText().toString()), Double.parseDouble(imagNum1.getText().toString()));
                    Complex num2 = new Complex(Double.parseDouble(realNum2.getText().toString()), Double.parseDouble(imagNum2.getText().toString()));

                    outputTV.setText(num1.subtract(num2));
                }else {
                    outputTV.setText(R.string.all_num_input);
                }
            }
        });

        //Multiplication Button

        multBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!realNum1.getText().toString().equals("") &&!realNum2.getText().toString().equals(" ") &&!imagNum1.getText().toString().equals(" ") &&!imagNum2.getText().toString().equals(" ")){
                    Complex num1 = new Complex(Double.parseDouble(realNum1.getText().toString()), Double.parseDouble(imagNum1.getText().toString()));
                    Complex num2 = new Complex(Double.parseDouble(realNum2.getText().toString()), Double.parseDouble(imagNum2.getText().toString()));

                    outputTV.setText(num1.multiply(num2));
                }else {
                    outputTV.setText(R.string.all_num_input);
                }
            }
        });

        //Division Button

        divideBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!realNum1.getText().toString().equals("") &&!realNum2.getText().toString().equals(" ") &&!imagNum1.getText().toString().equals(" ") &&!imagNum2.getText().toString().equals(" ")){
                    Complex num1 = new Complex(Double.parseDouble(realNum1.getText().toString()), Double.parseDouble(imagNum1.getText().toString()));
                    Complex num2 = new Complex(Double.parseDouble(realNum2.getText().toString()), Double.parseDouble(imagNum2.getText().toString()));

                    outputTV.setText(num1.divide(num2));
                }else {
                    outputTV.setText(R.string.all_num_input);
                }
            }
        });

        //Absolute Value of Number #1 Button

        abs1BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!realNum1.getText().toString().equals("")&&!imagNum1.getText().toString().equals(" ")){
                    Complex num1 = new Complex(Double.parseDouble(realNum1.getText().toString()), Double.parseDouble(imagNum1.getText().toString()));

                    outputTV.setText(num1.abs());
                }else {
                    outputTV.setText(R.string.all_num1_input);
                }
            }
        });

        //Absolute Value of Number #2 Button

        abs2BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!realNum2.getText().toString().equals("")&&!imagNum2.getText().toString().equals("")){
                    Complex num2 = new Complex(Double.parseDouble(realNum2.getText().toString()), Double.parseDouble(imagNum2.getText().toString()));

                    outputTV.setText(num2.abs());
                }else {
                    outputTV.setText(R.string.all_num2_input);
                }
            }
        });

    }
}
