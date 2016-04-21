import java.util.Scanner;

public class GuessGame2 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		GetANumber randomNum = new GetANumber();
	
		System.out.print("Please enter a number between 1 and 10: ");
		double userInput= input.nextDouble();

		if (userInput==randomNum.getANumber())
			System.out.printf("Congrats, you guessed it. The correct number is %f\n",
					randomNum);
		else if (userInput > randomNum.getANumber())
			System.out.println("Your number is too large.");
		else
			System.out.println("Your number is too small.");

	}

}