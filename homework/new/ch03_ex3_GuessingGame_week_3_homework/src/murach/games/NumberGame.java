/**
  * @Author gcamp
  * @date Jan 28, 2023
  * @filename NumberGame.java
  * @project ch03_ex3_GuessingGame
 */
package murach.games;

import java.util.Random;

public class NumberGame {
	int upperLimit, number, guessCount = 0;
	public NumberGame() {
		this.upperLimit = 50;
		Random random = new Random();
        number = random.nextInt(this.upperLimit - 1) + 1;
	}
	public NumberGame(int upperLimit) {
		this.upperLimit = upperLimit;
        // Generate a random number between 0 and the upperLimit variable
		Random random = new Random();
        number = random.nextInt(this.upperLimit - 1) + 1;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	public int getNumber() {
		return number;
	}

	public int getGuessCount() {
		return guessCount;
	}
	
	public void incrementGuessCount() {
		guessCount++;
	}
	
}
