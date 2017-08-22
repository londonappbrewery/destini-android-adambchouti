package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // member variables:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Wire up the 3 views from the layout to the member variables:
        mStoryTextView  = (TextView) findViewById(R.id.storyTextView);
        mButtonTop      = (Button) findViewById(R.id.buttonTop);
        mButtonBottom   = (Button) findViewById(R.id.buttonBottom);

        // Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(mIndex == 1) {
                   // Set story line 3
                   mStoryTextView.setText(R.string.T3_Story);
                   mButtonTop.setText(R.string.T3_Ans1);
                   mButtonBottom.setText(R.string.T3_Ans2);
                   // Set index to 3
                   mIndex = 3;
               } else if(mIndex == 2) {
                   // Set story line 3
                   mStoryTextView.setText(R.string.T3_Story);
                   mButtonTop.setText(R.string.T3_Ans1);
                   mButtonBottom.setText(R.string.T3_Ans2);
                   // Set index to 3
                   mIndex = 3;
               } else if(mIndex == 3) {
                   // End story line 6
                   mStoryTextView.setText(R.string.T6_End);
                   mButtonTop.setText(R.string.T_YES);
                   mButtonBottom.setText(R.string.T_NO);
                   mIndex = 4;
               } else if(mIndex == 4) {
                   // Set story line 3
                   mStoryTextView.setText(R.string.T1_Story);
                   mButtonTop.setText(R.string.T1_Ans1);
                   mButtonBottom.setText(R.string.T1_Ans2);
                   mIndex = 1;
               }
            }
        });



        // Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIndex == 1) {
                    // Set story line 2
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    // Set index to 2
                    mIndex = 2;
                } else if(mIndex == 2) {
                    // End story line 4
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setText(R.string.T_YES);
                    mButtonBottom.setText(R.string.T_NO);
                    mIndex = 4;
                } else if(mIndex == 3) {
                    // End story line 5
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setText(R.string.T_YES);
                    mButtonBottom.setText(R.string.T_NO);
                    mIndex = 4;
                } else if(mIndex == 4) {
                    finish();
                }
            }
        });

    }
}
