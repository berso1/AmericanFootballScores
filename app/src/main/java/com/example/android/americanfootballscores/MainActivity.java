package com.example.android.americanfootballscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.android.americanfootballscores.R;

public class MainActivity extends AppCompatActivity {

    /** Global Variables */
    int visitorScore = 0;
    int homeScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**         Visitor Team Scores         */

    /**
     * Add 6 to visitorScore Variable and display it on
     * visitor_team_score TextView.
     */
    public void touchdownVisitor(View view) {
        visitorScore = visitorScore + 6;
        displayForVisitorTeam(visitorScore);
    }

    /**
     * Add 1 to visitorScore Variable and display it on
     * visitor_team_score TextView.
     */
    public void extraPointVisitor(View view) {
        visitorScore = visitorScore + 1;
        displayForVisitorTeam(visitorScore);
    }

    /**
     * Add 6 to visitorScore Variable and display it on
     * visitor_team_score TextView.
     */
    public void fieldGoalVisitor(View view) {
        visitorScore = visitorScore + 3;
        displayForVisitorTeam(visitorScore);
    }

    /**
     * Add 2 to visitorScore Variable and display it on
     * visitor_team_score TextView.
     */
    public void twoPointVisitor(View view) {
        visitorScore = visitorScore + 2;
        displayForVisitorTeam(visitorScore);
    }

    /**
     * Displays the given score for Visitor Team .
     */
    public void displayForVisitorTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**   End of Visitor Team Scores */

    /**         Home Team Scores         */

    /**
     * Add 6 to homeScore Variable and display it on
     * home_team_score TextView.
     */
    public void touchdownHome(View view) {
        homeScore = homeScore + 6;
        displayForHomeTeam(homeScore);
    }

    /**
     * Add 1 to homeScore Variable and display it on
     * home_team_score TextView.
     */
    public void extraPointHome(View view) {
        homeScore = homeScore + 1;
        displayForHomeTeam(homeScore);
    }

    /**
     * Add 6 to homeScore Variable and display it on
     * home_team_score TextView.
     */
    public void fieldGoalHome(View view) {
        homeScore = homeScore + 3;
        displayForHomeTeam(homeScore);
    }

    /**
     * Add 2 to homeScore Variable and display it on
     * home_team_score TextView.
     */
    public void twoPointHome(View view) {
        homeScore = homeScore + 2;
        displayForHomeTeam(homeScore);
    }

    /**
     * Displays the given score for Home Team .
     */
    public void displayForHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**   End of Home Team Scores */



    /**
     * Reset scores
     */
    public void resetScores(View view) {
        visitorScore = 0;
        homeScore = 0;
        displayForVisitorTeam(visitorScore);
        displayForHomeTeam(homeScore);
    }

}
