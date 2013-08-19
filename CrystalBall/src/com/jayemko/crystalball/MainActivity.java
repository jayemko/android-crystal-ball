package com.jayemko.crystalball;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Declare our View variables and assign them to the Views from the layout
    // file
    final TextView answerLabel = (TextView) findViewById(R.id.textView1);
    Button getAnswerButton = (Button) findViewById(R.id.button1);

    getAnswerButton.setOnClickListener(new View.OnClickListener() {

      @Override
      public void onClick(View view) {
        String[] answers = { "It is certain", "It is decidedly so", "All signs say YES",
            "The stars are not aligned", "My reply is no", "It is doubtful",
            "Better not tell you now", "Concentrate and ask again",
            "Unable to answer now" };
        // The button was clicked, so update the answer label with an answer
        String answer = "";

        // Randomly select one of three answers: Yes, No, or Maybe;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(answers.length);
        answer = answers[randomNumber];
        answerLabel.setText(answer);

      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

}
