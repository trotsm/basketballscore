package com.example.android.b_ballscore2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulAQOne = 0;
    int foulAQTwo = 0;
    int foulAQThree = 0;
    int foulAQFour = 0;
    int foulBQOne = 0;
    int foulBQTwo = 0;
    int foulBQThree = 0;
    int foulBQFour = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    // reset all result to 0;

    public void resetScore(View view) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        foulAQOne = foulAQTwo = foulAQThree = foulAQFour = 0;
        foulBQOne = foulBQTwo = foulBQThree = foulBQFour = 0;
        displayAQOne(foulAQOne);
        displayAQTwo(foulAQTwo);
        displayAQThree(foulAQThree);
        displayAQFour(foulAQFour);
        displayBQOne(foulBQOne);
        displayBQTwo(foulBQTwo);
        displayBQThree(foulBQThree);
        displayBQFour(foulBQFour);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_a);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void onePointA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_team_b);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void onePointB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given foul for Team A Q1.
     */
    public void displayAQOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foul_one_a);
        scoreView.setText(String.valueOf(score));
    }

    public void oneQA(View view) {
        foulAQOne = foulAQOne + 1;
        displayAQOne(foulAQOne);
    }

    /**
     * Displays the given foul for Team A Q2.
     */
    public void displayAQTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.f_two_a);
        scoreView.setText(String.valueOf(score));
    }

    public void twoQA(View view) {
        foulAQTwo = foulAQTwo + 1;
        displayAQTwo(foulAQTwo);
    }

    /**
     * Displays the given foul for Team A Q3.
     */
    public void displayAQThree(int score) {
        TextView scoreView = (TextView) findViewById(R.id.f_three_a);
        scoreView.setText(String.valueOf(score));
    }

    public void threeQA(View view) {
        foulAQThree = foulAQThree + 1;
        displayAQThree(foulAQThree);
    }

    /**
     * Displays the given foul for Team A Q4.
     */
    public void displayAQFour(int score) {
        TextView scoreView = (TextView) findViewById(R.id.f_four_a);
        scoreView.setText(String.valueOf(score));
    }

    public void fourQA(View view) {
        foulAQFour = foulAQFour + 1;
        displayAQFour(foulAQFour);
    }

    /**
     * Displays the given foul for Team B Q1.
     */
    public void displayBQOne(int score) {
        TextView scoreView = (TextView) findViewById(R.id.f_one_b);
        scoreView.setText(String.valueOf(score));
    }

    public void oneQB(View view) {
        foulBQOne = foulBQOne + 1;
        displayBQOne(foulBQOne);
    }

    /**
     * Displays the given foul for Team B Q2.
     */
    public void displayBQTwo(int score) {
        TextView scoreView = (TextView) findViewById(R.id.f_two_b);
        scoreView.setText(String.valueOf(score));
    }

    public void twoQB(View view) {
        foulBQTwo = foulBQTwo + 1;
        displayBQTwo(foulBQTwo);
    }

    /**
     * Displays the given foul for Team B Q3.
     */
    public void displayBQThree(int score) {
        TextView scoreView = (TextView) findViewById(R.id.f_three_b);
        scoreView.setText(String.valueOf(score));
    }

    public void threeQB(View view) {
        foulBQThree = foulBQThree + 1;
        displayBQThree(foulBQThree);
    }

    /**
     * Displays the given foul for Team B Q3.
     */
    public void displayBQFour(int score) {
        TextView scoreView = (TextView) findViewById(R.id.f_four_b);
        scoreView.setText(String.valueOf(score));
    }

    public void fourQB(View view) {
        foulBQFour = foulBQFour + 1;
        displayBQFour(foulBQFour);
    }
}



