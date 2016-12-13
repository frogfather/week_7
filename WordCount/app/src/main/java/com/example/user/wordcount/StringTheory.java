package com.example.user.wordcount;

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




/**
 * Created by user on 13/12/2016.
 */
public class StringTheory extends AppCompatActivity{
    EditText inputEditText;
    Button analyseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("String Thing", "onCreateCalled");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEditText = (EditText) findViewById(R.id.input_text);
        analyseButton = (Button) findViewById(R.id.analyse_button);


        analyseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("String Thing", "analyse button clicked");
                String inputText = inputEditText.getText().toString();
                Log.d("String Thing", "Input " + inputText);
                Wordcount wordcount = new Wordcount();
                wordcount.splitString(inputText);
                String[] separated = wordcount.getArray();
                wordcount.makeHashMap(separated);
                String string_report = wordcount.getWordDistribution();

                Intent intent = new Intent(StringTheory.this, StringResult.class);
                intent.putExtra("result_string", string_report);
                startActivity(intent);


            }
        });
    }

}