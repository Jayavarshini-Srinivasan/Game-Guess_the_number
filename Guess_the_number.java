package guess_the_number;
import java.util.Random;
import java.util.Scanner;
public class Guess_the_number {
	public static void main(String args[]) {
		System.out.println("Hi, welcome to the game! This is a number guessing game.");
		System.out.println("You got 5 chances to guess the number. Let's start the game!");
		Random rand = new Random();
		int numberToGuess = rand.nextInt(100); 
		int chances = 5;
		int guessCounter = 0;

		Scanner scanner = new Scanner(System.in);

		while (guessCounter < chances) {
			guessCounter++;
		    System.out.print("Please enter your guess: ");
		    int myGuess = scanner.nextInt();

		    if (myGuess == numberToGuess) {
		    	System.out.println("The number is " + numberToGuess + " and you found it right!! in the " + guessCounter + " attempt.");
		        break;
		            } 
		    
		    else if (guessCounter >= chances) {
		                System.out.println("Oops, the number is " + numberToGuess + ". Better luck next time.");
		            } 
		    else if (myGuess > numberToGuess) {
		                System.out.println("Your guess is higher.");
		            } 
		    else if (myGuess < numberToGuess) {
		                System.out.println("Your guess is lower.");
		            }
		    
		        }

		        scanner.close();
		
		
	}
	
}
