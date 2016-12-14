package com.example.user.rockgame;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.InputStream;

/**
 * Created by user on 14/12/2016.
 */
public class RockGame extends AppCompatActivity{

    TextView welcomeText;
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("RockGame", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button)findViewById(R.id.play_button);
        welcomeText = (TextView) findViewById(R.id.welcome_text);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("RockGame", "Play button clicked");
                Intent intent = new Intent(RockGame.this, PlayActivity.class);
                startActivity(intent);


            }
        });

    }



}
