package com.example.gcs.lontaraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;
    Button mMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mGrade = (TextView) findViewById(R.id.grade);
        mFinalScore = (TextView) findViewById(R.id.outof);
        mRetryButton = (Button) findViewById(R.id.retry);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText(" Jawaban yang benar " + score + " dari " + QuizBook.questions.length + " soal ");

        if (score == 10){
            mGrade.setText("Selamat");
        }else if (score == 9){
            mGrade.setText("Sedikit lagi");
        }else if (score == 8){
            mGrade.setText("Lumayan");
        }else {
            mGrade.setText("Belajar Lebih Giat Lagi");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultActivity.this, QuizActivity.class));

            }
        });

        mMenuButton = (Button) findViewById(R.id.menu);
        mMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMainActivity = new Intent(ResultActivity.this, MainActivity.class);
                openMainActivity.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivityIfNeeded(openMainActivity, 0);
            }
        });

    }
}
