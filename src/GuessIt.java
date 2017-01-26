import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GuessIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playAgain = 0;
		int guess = 0;
		int highScore = 99999999;
		Scanner in = new Scanner(System.in);
		
		do {
			
			int high = 100;
			int answer = ThreadLocalRandom.current().nextInt(0, high);
			
			int numGuesses = 0;
			int low = 0;
			
			
			do {
				System.out.println("Please guess a number between "+ low + " and " + high);
				guess = in.nextInt();
				numGuesses++;
				if (guess < answer){
					System.out.println("Your guess is too low.");
					low = guess+1;
				} else if (guess > answer){
					System.out.println("Your guess is too high.");
					high = guess-1;
				}
			} while (guess != answer);
			
			if(guess == answer){
				if (numGuesses < highScore){
					highScore = numGuesses;
					System.out.println("You have the new high score!");
				}
				System.out.println("You guessed correctly in " + numGuesses + " guesses");
				System.out.println("The current high score is: " + highScore);
				System.out.println("Press 1 to play again.");
				playAgain = in.nextInt();
				
				
			}
		} while (playAgain == 1);
		in.close();
	}
}
