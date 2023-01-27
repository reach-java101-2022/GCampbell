package murach.games;

import java.util.Random;
import java.util.Scanner; 
public class Main {

    public static void main(String args[]) {
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println();
        Scanner sc = new Scanner(System.in);	
        // TODO: Replace next line with code that prompts user for upper limit.
        System.out.print("Enter the upper limit for the number: ");
        int upperLimit = Integer.parseInt(sc.nextLine());
        // Generate a random number between 0 and the upperLimit variable
        Random random = new Random();
        int number = random.nextInt(upperLimit - 1) + 1;
        // initialize counters
        int g = 0;
        int t = 0;
        while (t == 0) {
        	//take guess
        	System.out.print("Enter your guess: ");
        	int i = Integer.parseInt(sc.nextLine());
        	g++;
        	//Check guess against numbers
        	if (i < number) {
        		System.out.println("Your guess is too low." + "\n");
        	}else if (i == number) {
        		System.out.println("Correct!" + "\n");
        		t++;
        	} else {
        		System.out.println("Your guess is too high." + "\n");
        	}
        }
        sc.close();
        System.out.println("Guesses: " + g);
        System.out.println("Bye!");  
    }
}