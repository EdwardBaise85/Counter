package edu.desu.dsuappacademy.freethrowappemulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivityFreeThrow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_free_throw);
    }
    int TeamA= 0;
    int TeamB= 0;

    public void plusThreePointsTeamA(View view){
     TeamA=TeamA+3;
     display_TeamA(TeamA);
    }

   public void plusTwoLayupTeamA (View View){
    TeamA=TeamA+2;
    display_TeamA(TeamA);
   }

    public void plusOneFreeThrowTeamA (View view){
    TeamA=TeamA+1;
    display_TeamA(TeamA);
    }

    public void plusThreePointsTeamB (View view){
    TeamB=TeamB+3;
    displayTeamB(TeamB);
    }

    public void plusTwoLayupTeamB (View view){
    TeamB=TeamB+2;
    displayTeamB(TeamB);
    }

    public void plusOneFreeThrowTeamB (View view){
        TeamB=TeamB+1;
        displayTeamB(TeamB);
    }




    public void reset (View view)
    {
    TeamA=0;
    TeamB=0;
    display_TeamA(0);
    displayTeamB(0);
    }
    private void display_TeamA(int number)
    {
        TextView QuantityTextView= (TextView)findViewById(R.id.TeamA_text_view);
        QuantityTextView.setText("" + number);
    }
    private void displayTeamB(int number) {
        TextView QuantityTextView = (TextView) findViewById(R.id.TeamB_text_view);
        QuantityTextView.setText("" + number);
    }
    }

