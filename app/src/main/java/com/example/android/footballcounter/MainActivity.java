package com.example.android.footballcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Declarations and initialize variables
    int goalsA = 0;
    int foulsA = 0;
    int yellowCardsA = 0;
    int redCardsA = 0;
    int offsidesA = 0;
    int cornersA = 0;

    int goalsB = 0;
    int foulsB = 0;
    int yellowCardsB = 0;
    int redCardsB = 0;
    int offsidesB = 0;
    int cornersB = 0;

    // Declarations variables
    EditText editText1;
    EditText editText2;


    // Declarations variables
    TextView goalsForTeamA;
    TextView foulsForTeamA;
    TextView yellowCardsForTeamA;
    TextView redCardsForTeamA;
    TextView offsidesForTeamA;
    TextView cornersForTeamA;

    // Declarations variables
    TextView goalsForTeamB;
    TextView foulsForTeamB;
    TextView yellowCardsForTeamB;
    TextView redCardsForTeamB;
    TextView offsidesForTeamB;
    TextView cornersForTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get id of TextView goalsForTeamA
        goalsForTeamA = findViewById(R.id.scoreGoalsA);
        // Set onClickListener method on TextView.
        goalsForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goalsA += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(goalsA, goalsB, goalsForTeamA, goalsForTeamB);
                //Display score on TextView.
                displayScore(goalsA,goalsForTeamA);

            }
        });

        // Get id of TextView foulsForTeamA.
        foulsForTeamA = findViewById(R.id.scoreFoulsA);
        // Set onClickListener method on TextView.
        foulsForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                foulsA += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(foulsA, foulsB, foulsForTeamA, foulsForTeamB);
                //Display score on TextView.
                displayScore(foulsA,foulsForTeamA);
            }
        });

        // Get id of TextView yellowCardsForTeamA.
        yellowCardsForTeamA = findViewById(R.id.scoreYellowCardsA);
        // Set onClickListener method on TextView.
        yellowCardsForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                yellowCardsA += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(yellowCardsA, yellowCardsB, yellowCardsForTeamA, yellowCardsForTeamB);
                //Display score on TextView.
                displayScore(yellowCardsA,yellowCardsForTeamA);
            }
        });

        // Get id of TextView redCardsForTeamA.
        redCardsForTeamA = findViewById(R.id.scoreRedCardsA);
        // Set onClickListener method on TextView.
        redCardsForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                redCardsA += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(redCardsA, redCardsB, redCardsForTeamA, redCardsForTeamB);
                //Display score on TextView.
                displayScore(redCardsA,redCardsForTeamA);
            }
        });

        // Get id of TextView offsidesForTeamA.
        offsidesForTeamA = findViewById(R.id.scoreOffsidesA);
        // Set onClickListener method on TextView.
        offsidesForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                offsidesA += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(offsidesA, offsidesB, offsidesForTeamA, offsidesForTeamB);
                //Display score on TextView.
                displayScore(offsidesA,offsidesForTeamA);
            }
        });
        // Get id of TextView cornersForTeamA.
        cornersForTeamA = findViewById(R.id.scoreCornersA);
        // Set onClickListener method on TextView.
        cornersForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cornersA += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(cornersA, cornersB, cornersForTeamA, cornersForTeamB);
                //Display score on TextView.
                displayScore(cornersA,cornersForTeamA);
            }
        });

        // Get id of TextView goalsForTeamB
        goalsForTeamB = findViewById(R.id.scoreGoalsB);
        // Set onClickListener method on TextView.
        goalsForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goalsB += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(goalsA, goalsB, goalsForTeamA, goalsForTeamB);
                //Display score on TextView.
                displayScore(goalsB,goalsForTeamB);
            }
        });

        // Get id of TextView foulsForTeamB
        foulsForTeamB = findViewById(R.id.scoreFoulsB);
        // Set onClickListener method on TextView.
        foulsForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                foulsB += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(foulsA, foulsB, foulsForTeamA, foulsForTeamB);
                //Display score on TextView.
                displayScore(foulsB,foulsForTeamB);
            }
        });

        // Get id of TextView yellowCardsForTeamB.
        yellowCardsForTeamB = findViewById(R.id.scoreYellowCardsB);
        // Set onClickListener method on TextView.
        yellowCardsForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                yellowCardsB += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(yellowCardsA, yellowCardsB, yellowCardsForTeamA, yellowCardsForTeamB);
                //Display score on TextView.
                displayScore(yellowCardsB,yellowCardsForTeamB);
            }
        });

        // Get id of TextView redCardsForTeamB.
        redCardsForTeamB = findViewById(R.id.scoreRedCardsB);
        // Set onClickListener method on TextView.
        redCardsForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                redCardsB += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(redCardsA, redCardsB, redCardsForTeamA, redCardsForTeamB);
                //Display score on TextView.
                displayScore(redCardsB,redCardsForTeamB);
            }
        });

        // Get id of TextView offsidesForTeamB.
        offsidesForTeamB = findViewById(R.id.scoreOffsidesB);
        // Set onClickListener method on TextView.
        offsidesForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                offsidesB += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(offsidesA, offsidesB, offsidesForTeamA, offsidesForTeamB);
                //Display score on TextView.
                displayScore(offsidesB,offsidesForTeamB);
            }
        });

        // Get id of TextView cornersForTeamB.
        cornersForTeamB = findViewById(R.id.scoreCornersB);
        // Set onClickListener method on TextView.
        cornersForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cornersB += 1;
                //Check the score on each category if is greater than other score, set that score to black color.
                setTextColor(cornersA, cornersB, cornersForTeamA, cornersForTeamB);
                //Display score on TextView.
                displayScore(cornersB,cornersForTeamB);
            }
        });

        // Get id of Button Reset
        Button btn = findViewById(R.id.reset_Button);
        // Set onClickListener method on Button.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resetScore();
            }
        });


    }

    //Check the score on each category if is greater than other score, set that score to black color.
    public void setTextColor(int scoreA, int scoreB, TextView textViewA, TextView textViewB) {

        if (scoreA > scoreB) {
            textViewA.setTextColor(Color.BLACK);
            textViewB.setTextColor(Color.GRAY);
        } else if (scoreA == scoreB) {
            textViewA.setTextColor(Color.BLACK);
            textViewB.setTextColor(Color.BLACK);
        } else {
            textViewA.setTextColor(Color.GRAY);
            textViewB.setTextColor(Color.BLACK);
        }
    }

    // Reset  TextViews, EditText to null and font colors to gray.
    public void resetScore() {
        goalsA = 0;
        foulsA = 0;
        yellowCardsA = 0;
        redCardsA = 0;
        offsidesA = 0;
        cornersA = 0;

        goalsB = 0;
        foulsB = 0;
        yellowCardsB = 0;
        redCardsB = 0;
        offsidesB = 0;
        cornersB = 0;

        displayScore(goalsA,goalsForTeamA);
        displayScore(foulsA,foulsForTeamA);
        displayScore(yellowCardsA,yellowCardsForTeamA);
        displayScore(redCardsA,redCardsForTeamA);
        displayScore(offsidesA,offsidesForTeamA);
        displayScore(cornersA,cornersForTeamA);

        displayScore(goalsB,goalsForTeamB);
        displayScore(foulsB,foulsForTeamB);
        displayScore(yellowCardsB,yellowCardsForTeamB);
        displayScore(redCardsB,redCardsForTeamB);
        displayScore(offsidesB,offsidesForTeamB);
        displayScore(cornersB,cornersForTeamB);


        editText1 = findViewById(R.id.EditText1);
        editText2 = findViewById(R.id.EditText2);

        editText1.setText("");
        editText2.setText("");

        goalsForTeamA.setTextColor(Color.GRAY);
        goalsForTeamB.setTextColor(Color.GRAY);

        foulsForTeamA.setTextColor(Color.GRAY);
        foulsForTeamB.setTextColor(Color.GRAY);

        yellowCardsForTeamA.setTextColor(Color.GRAY);
        yellowCardsForTeamB.setTextColor(Color.GRAY);

        redCardsForTeamA.setTextColor(Color.GRAY);
        redCardsForTeamB.setTextColor(Color.GRAY);

        offsidesForTeamA.setTextColor(Color.GRAY);
        offsidesForTeamB.setTextColor(Color.GRAY);

        cornersForTeamA.setTextColor(Color.GRAY);
        cornersForTeamB.setTextColor(Color.GRAY);
    }

    // Display score for both teams.
    public void displayScore(int score, TextView textView) {
        textView.setText("" + score);
    }
}