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
    int goalsA = 0, foulsA = 0, yellowCardsA = 0, redCardsA = 0, offsidesA = 0, cornersA;
    int goalsB = 0, foulsB = 0, yellowCardsB = 0, redCardsB = 0, offsidesB = 0, cornersB;

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

                if (goalsA > goalsB) {
                    goalsForTeamA.setTextColor(Color.BLACK);
                    goalsForTeamB.setTextColor(Color.GRAY);
                } else if (goalsA == goalsB) {

                    goalsForTeamA.setTextColor(Color.BLACK);
                    goalsForTeamB.setTextColor(Color.BLACK);

                } else {
                    goalsForTeamA.setTextColor(Color.GRAY);
                    goalsForTeamB.setTextColor(Color.BLACK);

                }
                displayGoalsTeamA(goalsA);

            }
        });

        // Get id of TextView foulsForTeamA.
        foulsForTeamA = findViewById(R.id.scoreFoulsA);
        // Set onClickListener method on TextView.
        foulsForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                foulsA += 1;
                if (foulsA > foulsB) {
                    foulsForTeamA.setTextColor(Color.BLACK);
                    foulsForTeamB.setTextColor(Color.GRAY);
                } else if (foulsA == foulsB) {

                    foulsForTeamA.setTextColor(Color.BLACK);
                    foulsForTeamB.setTextColor(Color.BLACK);

                } else {
                    foulsForTeamA.setTextColor(Color.GRAY);
                    foulsForTeamB.setTextColor(Color.BLACK);

                }
                displayFoulsTeamA(foulsA);
            }
        });

        // Get id of TextView yellowCardsForTeamA.
        yellowCardsForTeamA = findViewById(R.id.scoreYellowCardsA);
        // Set onClickListener method on TextView.
        yellowCardsForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                yellowCardsA += 1;
                if (yellowCardsA > yellowCardsB) {
                    yellowCardsForTeamA.setTextColor(Color.BLACK);
                    yellowCardsForTeamB.setTextColor(Color.GRAY);
                } else if (yellowCardsA == yellowCardsB) {

                    yellowCardsForTeamA.setTextColor(Color.BLACK);
                    yellowCardsForTeamB.setTextColor(Color.BLACK);

                } else {
                    yellowCardsForTeamA.setTextColor(Color.GRAY);
                    yellowCardsForTeamB.setTextColor(Color.BLACK);

                }
                displayYellowCardsTeamA(yellowCardsA);
            }
        });

        // Get id of TextView redCardsForTeamA.
        redCardsForTeamA = findViewById(R.id.scoreRedCardsA);
        // Set onClickListener method on TextView.
        redCardsForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                redCardsA += 1;
                if (redCardsA > redCardsB) {
                    redCardsForTeamA.setTextColor(Color.BLACK);
                    redCardsForTeamB.setTextColor(Color.GRAY);
                } else if (redCardsA == redCardsB) {

                    redCardsForTeamA.setTextColor(Color.BLACK);
                    redCardsForTeamB.setTextColor(Color.BLACK);

                } else {
                    redCardsForTeamA.setTextColor(Color.GRAY);
                    redCardsForTeamB.setTextColor(Color.BLACK);

                }
                displayRedCardsTeamA(redCardsA);
            }
        });

        // Get id of TextView offsidesForTeamA.
        offsidesForTeamA = findViewById(R.id.scoreOffsidesA);
        // Set onClickListener method on TextView.
        offsidesForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                offsidesA += 1;
                if (offsidesA > offsidesB) {
                    offsidesForTeamA.setTextColor(Color.BLACK);
                    offsidesForTeamB.setTextColor(Color.GRAY);
                } else if (offsidesA == offsidesB) {

                    offsidesForTeamA.setTextColor(Color.BLACK);
                    offsidesForTeamB.setTextColor(Color.BLACK);

                } else {
                    offsidesForTeamA.setTextColor(Color.GRAY);
                    offsidesForTeamB.setTextColor(Color.BLACK);

                }
                displayOffsidesTeamA(offsidesA);
            }
        });
        // Get id of TextView cornersForTeamA.
        cornersForTeamA = findViewById(R.id.scoreCornersA);
        // Set onClickListener method on TextView.
        cornersForTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cornersA += 1;
                if (cornersA > cornersB) {
                    cornersForTeamA.setTextColor(Color.BLACK);
                    cornersForTeamB.setTextColor(Color.GRAY);
                } else if (cornersA == cornersB) {

                    cornersForTeamA.setTextColor(Color.BLACK);
                    cornersForTeamB.setTextColor(Color.BLACK);

                } else {
                    cornersForTeamA.setTextColor(Color.GRAY);
                    cornersForTeamB.setTextColor(Color.BLACK);

                }
                displayCornersTeamA(cornersA);
            }
        });

        // Get id of TextView goalsForTeamB
        goalsForTeamB = findViewById(R.id.scoreGoalsB);
        // Set onClickListener method on TextView.
        goalsForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goalsB += 1;
                if (goalsA > goalsB) {
                    goalsForTeamA.setTextColor(Color.BLACK);
                    goalsForTeamB.setTextColor(Color.GRAY);
                } else if (goalsA == goalsB) {

                    goalsForTeamA.setTextColor(Color.BLACK);
                    goalsForTeamB.setTextColor(Color.BLACK);

                } else {
                    goalsForTeamA.setTextColor(Color.GRAY);
                    goalsForTeamB.setTextColor(Color.BLACK);

                }
                displayGoalsTeamB(goalsB);
            }
        });

        // Get id of TextView foulsForTeamB
        foulsForTeamB = findViewById(R.id.scoreFoulsB);
        // Set onClickListener method on TextView.
        foulsForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                foulsB += 1;
                if (foulsA > foulsB) {
                    foulsForTeamA.setTextColor(Color.BLACK);
                    foulsForTeamB.setTextColor(Color.GRAY);
                } else if (foulsA == foulsB) {

                    foulsForTeamA.setTextColor(Color.BLACK);
                    foulsForTeamB.setTextColor(Color.BLACK);

                } else {
                    foulsForTeamA.setTextColor(Color.GRAY);
                    foulsForTeamB.setTextColor(Color.BLACK);

                }
                displayFoulsTeamB(foulsB);
            }
        });

        // Get id of TextView yellowCardsForTeamB.
        yellowCardsForTeamB = findViewById(R.id.scoreYellowCardsB);
        // Set onClickListener method on TextView.
        yellowCardsForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                yellowCardsB += 1;
                if (yellowCardsA > yellowCardsB) {
                    yellowCardsForTeamA.setTextColor(Color.BLACK);
                    yellowCardsForTeamB.setTextColor(Color.GRAY);
                } else if (yellowCardsA == yellowCardsB) {

                    yellowCardsForTeamA.setTextColor(Color.BLACK);
                    yellowCardsForTeamB.setTextColor(Color.BLACK);

                } else {
                    yellowCardsForTeamA.setTextColor(Color.GRAY);
                    yellowCardsForTeamB.setTextColor(Color.BLACK);

                }
                displayYellowCardsTeamB(yellowCardsB);
            }
        });

        // Get id of TextView redCardsForTeamB.
        redCardsForTeamB = findViewById(R.id.scoreRedCardsB);
        // Set onClickListener method on TextView.
        redCardsForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                redCardsB += 1;
                if (redCardsA > redCardsB) {
                    redCardsForTeamA.setTextColor(Color.BLACK);
                    redCardsForTeamB.setTextColor(Color.GRAY);
                } else if (redCardsA == redCardsB) {

                    redCardsForTeamA.setTextColor(Color.BLACK);
                    redCardsForTeamB.setTextColor(Color.BLACK);

                } else {
                    redCardsForTeamA.setTextColor(Color.GRAY);
                    redCardsForTeamB.setTextColor(Color.BLACK);

                }
                displayRedCardsTeamB(redCardsB);
            }
        });

        // Get id of TextView offsidesForTeamB.
        offsidesForTeamB = findViewById(R.id.scoreOffsidesB);
        // Set onClickListener method on TextView.
        offsidesForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                offsidesB += 1;
                if (offsidesA > offsidesB) {
                    offsidesForTeamA.setTextColor(Color.BLACK);
                    offsidesForTeamB.setTextColor(Color.GRAY);
                } else if (offsidesA == offsidesB) {

                    offsidesForTeamA.setTextColor(Color.BLACK);
                    offsidesForTeamB.setTextColor(Color.BLACK);

                } else {
                    offsidesForTeamA.setTextColor(Color.GRAY);
                    offsidesForTeamB.setTextColor(Color.BLACK);

                }
                displayOffsidesTeamB(offsidesB);
            }
        });

        // Get id of TextView cornersForTeamB.
        cornersForTeamB = findViewById(R.id.scoreCornersB);
        // Set onClickListener method on TextView.
        cornersForTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cornersB += 1;
                if (cornersA > cornersB) {
                    cornersForTeamA.setTextColor(Color.BLACK);
                    cornersForTeamB.setTextColor(Color.GRAY);
                } else if (cornersA == cornersB) {

                    cornersForTeamA.setTextColor(Color.BLACK);
                    cornersForTeamB.setTextColor(Color.BLACK);

                } else {
                    cornersForTeamA.setTextColor(Color.GRAY);
                    cornersForTeamB.setTextColor(Color.BLACK);

                }
                displayCornersTeamB(cornersB);
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

        displayGoalsTeamA(goalsA);
        displayFoulsTeamA(foulsA);
        displayYellowCardsTeamA(yellowCardsA);
        displayRedCardsTeamA(redCardsA);
        displayOffsidesTeamA(offsidesA);
        displayCornersTeamA(cornersA);

        displayGoalsTeamB(goalsB);
        displayFoulsTeamB(foulsB);
        displayYellowCardsTeamB(yellowCardsB);
        displayRedCardsTeamB(redCardsB);
        displayOffsidesTeamB(offsidesB);
        displayCornersTeamB(cornersB);

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

    // Display goals scored in team A.
    public void displayGoalsTeamA(int score) {

        goalsForTeamA.setText("" + score);
    }

    // Display fouls scored in team A.
    public void displayFoulsTeamA(int score) {

        foulsForTeamA.setText("" + score);
    }

    // Display yellow cards scored in team A.
    public void displayYellowCardsTeamA(int score) {

        yellowCardsForTeamA.setText("" + score);
    }

    // Display red cards scored in team A.
    public void displayRedCardsTeamA(int score) {

        redCardsForTeamA.setText("" + score);
    }

    // Display offsides scored in team A.
    public void displayOffsidesTeamA(int score) {

        offsidesForTeamA.setText("" + score);


    }

    // Display corners scored in team A.
    public void displayCornersTeamA(int score) {

        cornersForTeamA.setText("" + score);
    }

    // Display goals scored in team B.
    public void displayGoalsTeamB(int score) {

        goalsForTeamB.setText("" + score);
    }

    // Display fouls scored in team B.
    public void displayFoulsTeamB(int score) {

        foulsForTeamB.setText("" + score);
    }

    // Display yellow cards scored in team B.
    public void displayYellowCardsTeamB(int score) {

        yellowCardsForTeamB.setText("" + score);
    }

    // Display red cards scored in team B.
    public void displayRedCardsTeamB(int score) {

        redCardsForTeamB.setText("" + score);
    }

    // Display offsides scored in team B.
    public void displayOffsidesTeamB(int score) {

        offsidesForTeamB.setText("" + score);
    }

    // Display corners scored in team B.
    public void displayCornersTeamB(int score) {

        cornersForTeamB.setText("" + score);
    }




}
















