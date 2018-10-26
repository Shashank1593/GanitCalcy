package com.example.shashankmishra.ganitcalcy;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    Button clear, divide, multiplication, backbutton, one, two, three, substraction, four, five, six, add,
            seven, eight, nine, percent, dot, zero, equal;
    TextView value;
    double valueOne, valueTwo;

    boolean calsyAddition, calsyMultiplication, calsySubstraction, calsyDivision, calcyPercent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.ll1);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        dot = (Button) findViewById(R.id.dot);
        clear = (Button) findViewById(R.id.clear);
        divide = (Button) findViewById(R.id.divide);
        multiplication = (Button) findViewById(R.id.multiplication);
        backbutton = (Button) findViewById(R.id.backbutton);
        substraction = (Button) findViewById(R.id.substraction);
        add = (Button) findViewById(R.id.add);
        percent = (Button) findViewById(R.id.percent);
        equal = (Button) findViewById(R.id.equal);
        value = findViewById(R.id.value);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText(value.getText() + "9");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((value.getText().toString().contains(".")))
                    return;
                else {
                    value.setText(value.getText().toString() + ".");
                }

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value.getText().toString().isEmpty()) {
                    showSnackBar();
                    return;
                } else {
                    valueOne = Double.parseDouble(value.getText().toString());
                    calsyAddition = true;
                    value.setText("");
                }
            }
        });

        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value.getText().toString().isEmpty()) {
                    showSnackBar();
                    return;
                }
                if (value == null) {
                    value.setText("");
                } else {
                    valueOne = Double.parseDouble(value.getText() + "");
                    calsySubstraction = true;
                    value.setText(null);
                }
            }
        });


        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value.getText().toString().isEmpty()) {
                    showSnackBar();
                    return;
                }
                if (value == null) {
                    value.setText("");
                } else {
                    valueOne = Double.parseDouble(value.getText() + "");
                    calsyMultiplication = true;
                    value.setText(null);
                }
            }

        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value.getText().toString().isEmpty()) {
                    showSnackBar();
                    return;
                }
                if (value == null) {
                    value.setText("");
                } else {
                    valueOne = Double.parseDouble(value.getText() + "");
                    calsyDivision = true;
                    value.setText(null);
                }
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value.getText().toString().isEmpty()) {
                    showSnackBar();
                    return;
                }
                if (value == null) {
                    value.setText("");
                } else {
                    valueOne = Double.parseDouble(value.getText() + "");
                    calcyPercent = true;
                    value.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value.getText().toString().isEmpty()) {
                    showSnackBar();
                    return;
                }
                valueTwo = Double.parseDouble(value.getText().toString());
                if (calsyAddition == true) {
                    value.setText(valueOne + valueTwo + "");
                    calsyAddition = false;
                    return;
                }

                if (calsySubstraction == true) {
                    value.setText(valueOne - valueTwo + "");
                    calsySubstraction = false;
                    return;
                }

                if (calsyDivision == true) {
                    if (valueTwo == 0) {
                        Toast.makeText(MainActivity.this, "Can not divide by Zero", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    value.setText(valueOne / valueTwo + "");
                    calsyDivision = false;
                    return;
                }

                if (calsyMultiplication == true) {
                    value.setText(valueOne * valueTwo + "");
                    calsyMultiplication = false;
                    return;
                }

                if (calcyPercent == true) {
                    value.setText(((valueOne / 100) * valueTwo) + "");
                    calcyPercent = false;
                    return;
                }

                showSnackBar();

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value.setText("");
                valueOne = Double.NaN;
                valueTwo = Double.NaN;
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value.getText().length() > 0) {
                    CharSequence chr = value.getText().toString();
                    value.setText(chr.subSequence(0, chr.length() - 1));
                } else {
                    valueOne = Double.NaN;
                    valueTwo = Double.NaN;
                    value.setText(null);
                    //info.setText(null);
                }

            }
        });
    }

    void showSnackBar() {
        Snackbar.make(linearLayout, "Enter Value", Snackbar.LENGTH_SHORT).show();
    }
}
