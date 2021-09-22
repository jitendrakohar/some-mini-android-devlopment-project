package com.example.countergoal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreA=0;
int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
//   public void removePoints(View view){
//        score=0;
//        TextView scoreView=(TextView) findViewById(R.id.scoreTextView);
//        scoreView.setText(String.valueOf(score));
//   }
//    public void addPoints(View view){
//        score++;
//        TextView scoreView=(TextView) findViewById(R.id.scoreTextView);
//        scoreView.setText(String.valueOf(score));
//    }
//    public void resetPoints(View view){
//        score--;
//        TextView scoreView=(TextView) findViewById(R.id.scoreTextView);
//        scoreView.setText(String.valueOf(score));
//    }
public void displayTeamA(int score){
        TextView scoreViewA=(TextView) findViewById(R.id.scoreTextViewA);
        scoreViewA.setText(String.valueOf(score));
}
    public void displayTeamB(int score){
        TextView scoreViewB=(TextView) findViewById(R.id.scoreTextViewB);
        scoreViewB.setText(String.valueOf(score));
    }

    public void addPointsA(View view) {
     scoreA+=2;
        displayTeamA(scoreA);
    }
    public void removePointsA(View view)
    {
        scoreA-=2;
        displayTeamA(scoreA);
    }
    public void addPointsB(View view) {
        scoreB+=2;
        displayTeamB(scoreB);
    }
    public void removePointsB(View view)
    {
        scoreB-=2;
        displayTeamB(scoreB);
    }
    public void resetPoints(View view){
        scoreA=0;
        scoreB=0;
        displayTeamA(scoreA);
        displayTeamB(scoreB);
    }
}