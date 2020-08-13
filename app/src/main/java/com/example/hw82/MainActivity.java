package com.example.hw82;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mDeleteBtn;
    private Button mSumBtn;
    private Button mSubtractBtn;
    private Button mDivideBtn;
    private Button mMultiplyBtn;
    private Button mEqualsBtn;

    private Button mBtnOne;
    private Button mBtnTwo;
    private Button mBtnThree;
    private Button mBtnFour;
    private Button mBtnFive;
    private Button mBtnSix;
    private Button mBtnSeven;
    private Button mBtnEight;
    private Button mBtnNine;
    private Button mBtnZero;
    private Button mBtnDot;

    private TextView mTxtViewShowResult;
    private TextView mTxtViewShowOparandOperator;


    private float mValue1;
    private float mValue2;
    private float mResult;
    private float mMemory=0; // to do

    private boolean mAdd;
    private boolean mSubtract;
    private boolean mMultiply;
    private boolean mDivide;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setListener();

    }


    private void setListener() {

        mBtnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mBtnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mSumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAdd = true;
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + " + ");
            }
        });

        mSubtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSubtract = true;
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + " - ");
            }
        });

        mMultiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMultiply = true;
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + " * ");
            }
        });

        mDivideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDivide = true;
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + " / ");
            }
        });

        mEqualsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] strings = extractValueString(mTxtViewShowOparandOperator);

                if (mAdd) {
                    mValue1 = Float.parseFloat(strings[0]);
                    mValue2 = Float.parseFloat(strings[2]);
                    mResult = mValue1 + mValue2;
                    mTxtViewShowResult.setText(mResult + "");
                    mAdd = false;

                }
                if (mSubtract) {
                    mValue1 = Float.parseFloat(strings[0]);
                    mValue2 = Float.parseFloat(strings[2]);
                    mResult = mValue1 - mValue2;
                    mTxtViewShowResult.setText(mResult + "");
                    mSubtract = false;

                }
                if (mMultiply) {
                    mValue1 = Float.parseFloat(strings[0]);
                    mValue2 = Float.parseFloat(strings[2]);
                    mResult = mValue1 * mValue2;
                    mTxtViewShowResult.setText(mResult + "");
                    mMultiply = false;

                }
                if (mDivide) {
                    mValue1 = Float.parseFloat(strings[0]);
                    mValue2 = Float.parseFloat(strings[2]);
                    if (mValue2 != 0) {
                        mResult = mValue1 / mValue2;
                        mTxtViewShowResult.setText(mResult + "");
                    } else {
                        Toast.makeText(MainActivity.this, "Divide On Zero Value!!! Change the value.", Toast.LENGTH_SHORT).show();
                    }
                    mDivide = false;

                }

                mTxtViewShowOparandOperator.setText("");


            }
        });

        mDeleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtViewShowOparandOperator.setText("");
                mTxtViewShowResult.setText("");
            }
        });


    }

    private String[] extractValueString(TextView textView) {
        String str = textView.getText().toString();
        String[] strArray = str.split(" ");
        return strArray;
    }

    private void extractValueButton(View view) {
        int id = view.getId();

        switch (id) {

            case R.id.btn_zero:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "0");
                break;
            case R.id.btn_1:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "1");
                break;
            case R.id.btn_2:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "2");
                break;
            case R.id.btn_3:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "3");
                break;
            case R.id.btn_4:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "4");
                break;
            case R.id.btn_5:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "5");
                break;
            case R.id.btn_6:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "6");
                break;
            case R.id.btn_7:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "7");
                break;
            case R.id.btn_8:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "8");
                break;
            case R.id.btn_9:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + "9");
                break;
            case R.id.btn_dot:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + ".");
                break;
        }

    }

    private void findViews() {
        mDeleteBtn = findViewById(R.id.btn_delete);
        mDivideBtn = findViewById(R.id.btn_divide);
        mMultiplyBtn = findViewById(R.id.btn_multiply);
        mSubtractBtn = findViewById(R.id.btn_subtract);
        mSumBtn = findViewById(R.id.btn_sum);
        mEqualsBtn = findViewById(R.id.btn_equals);

        mBtnDot = findViewById(R.id.btn_dot);
        mBtnZero = findViewById(R.id.btn_zero);

        mBtnOne = findViewById(R.id.btn_1);
        mBtnTwo = findViewById(R.id.btn_2);
        mBtnThree = findViewById(R.id.btn_3);
        mBtnFour = findViewById(R.id.btn_4);
        mBtnFive = findViewById(R.id.btn_5);
        mBtnSix = findViewById(R.id.btn_6);
        mBtnSeven = findViewById(R.id.btn_7);
        mBtnEight = findViewById(R.id.btn_8);
        mBtnNine = findViewById(R.id.btn_9);

        mTxtViewShowResult = findViewById(R.id.text_view_output_result);
        mTxtViewShowOparandOperator = findViewById(R.id.text_view_show_operand_operator);

    }

}