package com.example.igor.ex_3;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.constraint.ConstraintLayout;
import android.widget.TextView;

public class EX_3 extends AppCompatActivity {

    private ConstraintLayout mRelativeLayout;

    private TextView mTextStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_3);
        mRelativeLayout= (ConstraintLayout) findViewById(R.id.relativeLayout);
        mTextStr = (TextView)findViewById(R.id.textStr);
    }

    public void greenButtonClick(View view) {
        mTextStr.setText(R.string.green);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(EX_3.this,R.color.greenColor));
    }

    public void yellowButtonClick(View view) {
        mTextStr.setText(R.string.yellow);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(EX_3.this,R.color.yellowColor));
    }

    public void redButtonClick(View view) {
        mTextStr.setText(R.string.red);
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(EX_3.this,R.color.redColor));
    }
}
