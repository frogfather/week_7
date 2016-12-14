package com.example.user.rockgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 14/12/2016.
 */
public class PlayActivity extends AppCompatActivity {
    Button rockButton;
    Button scissorsButton;
    Button paperButton;
    TextView resultText;
    int wins;
    int loses;
    int draws;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton = (Button)findViewById(R.id.scissors_button);
        resultText =   (TextView) findViewById(R.id.result_text);
        wins = 0;
        loses = 0;
        draws = 0;

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RockGame", "Rock button clicked");
                //put "rock" in  a string and send it to playGame method
                sendChoice("Rock");
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockGame", "Paper button clicked");
                //put "paper" in  a string and send it to playGame method
                sendChoice("Paper");
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockGame", "Scissors button clicked");
                //put "scissors" in  a string and send it to playGame method
                sendChoice("Scissors");

            }
        });




    }


    protected void sendChoice(String choice){
        RPS game = new RPS();
        String computer = game.computerInput();
        String gameResult = game.playGame(choice,computer);
        String gameStats = statistics(gameResult);
        String result = "You played: "+choice+", I played "+computer+" "+gameResult+"\n"+gameStats;

        resultText.setText(result);
    }

    protected String statistics(String result){
        if (result.equals("It's a draw!")) {
            draws++;}
        else if (result.equals("You win!")) {
            wins++;}
        else if (result.equals("You lose!")){
            loses++;
        }
    return "Win: "+wins+" Lose: "+loses+" Draw: "+draws;
    };

}
