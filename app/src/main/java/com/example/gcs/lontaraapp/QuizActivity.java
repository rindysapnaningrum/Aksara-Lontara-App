package com.example.gcs.lontaraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    private ImageView mImageView, mQuestion;
    private Button mTrueButton, mFalseButton;

    private boolean mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mImageView = (ImageView) findViewById(R.id.imageView);
        mQuestion = (ImageView) findViewById(R.id.question);
        mTrueButton = (Button) findViewById(R.id.trueButton);
        mFalseButton = (Button) findViewById(R.id.falseButton);

        updateQuestion();

        //Logic for True Button
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mAnswer == true) {
                    mScore++; //This Updates the score int variable

                    //perform this check before you update question
                    if (mQuestionNumber == QuizBook.questions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }

                //if the answer is wrong
                else {
                    if (mQuestionNumber == QuizBook.questions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

        // Logic for False Button
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mAnswer == false) {
                    mScore++; //This Updates the score int variable

                    //perform this check before you update question
                    if (mQuestionNumber == QuizBook.questions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }

                //if the answer is wrong
                else {
                    if (mQuestionNumber == QuizBook.questions.length) {
                        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });


    }

    private void updateQuestion() {
        mImageView.setImageResource(QuizBook.images[mQuestionNumber]);
        mQuestion.setImageResource(QuizBook.questions[mQuestionNumber]);
        mAnswer = QuizBook.answer[mQuestionNumber];
        mQuestionNumber++;
    }
}
