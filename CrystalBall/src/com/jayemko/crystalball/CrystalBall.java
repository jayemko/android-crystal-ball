/**
 * 
 */
package com.jayemko.crystalball;

import java.util.Random;

/**
 * @author Jason Koceja
 */
public class CrystalBall {

  String[] mAnswers = { "It is certain", "It is decidedly so", "All signs say YES",
      "The stars are not aligned", "My reply is no", "It is doubtful",
      "Better not tell you now", "Concentrate and ask again", "Unable to answer now" };

  public String getAnAnswer() {

    String answer = "";

    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(mAnswers.length);
    answer = mAnswers[randomNumber];

    return answer;
  }
}
