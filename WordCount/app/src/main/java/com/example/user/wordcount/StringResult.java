package com.example.user.wordcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class StringResult extends AppCompatActivity {
    TextView answerText;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        answerText = (TextView)findViewById(R.id.result_text);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("result_string");
        answerText.setText(answer);
    }

}



