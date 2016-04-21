import java.util.Scanner;

public class GuessGame2 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		RandomNumber randomNumber = new RandomNumber (10);
	
		System.out.print("Guess what the random number will be: ");
		int userGuess = input.nextInt();

		if (userGuess==randomNumber.getANumber())
			System.out.printf("Congrats, you guessed it. The correct number is %f\n",
					randomNumber.getANumber());
		else if (userGuess > randomNumber.getANumber())
			System.out.println("Your number is too large.");
		else
			System.out.println("Your number is too small.");
		
		System.out.printf("Random number is %d",randomNumber.getANumber());
	}

}