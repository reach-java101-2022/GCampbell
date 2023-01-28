package murach.games;

import java.util.Scanner; 
public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();
        Scanner sc = new Scanner(System.in);	
        // TODO: Replace next line with code that prompts user for upper limit.
//        System.out.print("Enter the upper limit for the number: ");
//        int upperLimit = Integer.parseInt(sc.nextLine());
//        NumberGame ng = new NumberGame(upperLimit);
        // auto assign upper limit
        NumberGame ng = new NumberGame();
        // initialize counters
        int t = 0;
        while (t == 0) {
        	//take guess
        	System.out.print("Enter your guess: ");
        	int i = Integer.parseInt(sc.nextLine());
        	ng.incrementGuessCount();
        	//Check guess against numbers
        	if (i < ng.getNumber()) {
        		System.out.println("Your guess is too low." + "\n");
        	}else if (i == ng.getNumber()) {
        		System.out.println("Correct!" + "\n");
        		t++;
        	} else {
        		System.out.println("Your guess is too high." + "\n");
        	}
        }
        sc.close();
        System.out.println("Guesses: " + ng.getGuessCount());
        System.out.println("Bye!");  
    }
}