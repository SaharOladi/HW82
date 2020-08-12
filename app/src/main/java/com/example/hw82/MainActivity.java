package com.example.hw82;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

    private boolean mAdd;
    private boolean msubtract;
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
                extractValueButton(v);
            }
        });

        mSubtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mMultiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mDivideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extractValueButton(v);
            }
        });

        mSumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(mTxtViewShowOparandOperator.getText() + "");
                mAdd = true;
                mTxtViewShowOparandOperator.setText("");
            }
        });

        mSubtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(mTxtViewShowOparandOperator.getText() + "");
                msubtract = true;
                mTxtViewShowOparandOperator.setText("");
            }
        });

        mMultiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(mTxtViewShowOparandOperator.getText() + "");
                mMultiply = true;
                mTxtViewShowOparandOperator.setText("");
            }
        });

        mDivideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(mTxtViewShowOparandOperator.getText() + "");
                mDivide = true;
                mTxtViewShowOparandOperator.setText("");
            }
        });

        mEqualsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue2 = Float.parseFloat(mTxtViewShowOparandOperator.getText()+"");
                if(mAdd)
                    mResult = mValue1+mValue2;
                if(msubtract)
                    mResult = mValue1-mValue2;
                if(mMultiply)
                    mResult = mValue1*mValue2;
                if(mDivide)
                    mResult = mValue1/mValue2;

                mTxtViewShowResult.setText(mResult+"");
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

    private void extractValueButton(View view) {
        int id = view.getId();

        switch (id) {

            case R.id.btn_zero:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText()+"0");
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
            case R.id.btn_sum:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + " + ");
                break;
            case R.id.btn_subtract:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + " - ");
                break;
            case R.id.btn_multiply:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + " * ");
                break;
            case R.id.btn_divide:
                mTxtViewShowOparandOperator.setText(mTxtViewShowOparandOperator.getText() + " / ");
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