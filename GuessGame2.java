import java.util.Scanner;

public class GuessGame2 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		GetANumber randomNum = new GetANumber();
	
		System.out.print("Please enter a low number: ");
		int userInputLow= input.nextInt();
		
		System.out.print("Please enter a high number: ");
		int userInputHigh= input.nextInt();
		
		System.out.print("Now, guess what the random number will be: ");
		int userGuess = input.nextInt();

		if (userGuess==randomNum.getANumber())
			System.out.printf("Congrats, you guessed it. The correct number is %f\n",
					randomNum);
		else if (userGuess > randomNum.getANumber())
			System.out.println("Your number is too large.");
		else
			System.out.println("Your number is too small.");

	}

}