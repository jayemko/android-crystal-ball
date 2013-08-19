package com.jayemko.crystalball;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
  private CrystalBall mCrystalBall = new CrystalBall();

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
        String answer = mCrystalBall.getAnAnswer();
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
