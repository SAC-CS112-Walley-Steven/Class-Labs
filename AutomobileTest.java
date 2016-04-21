import java.util.Scanner;

public class AutomobileTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Automobile automobile1 = new Automobile (4,6,5, "Yellow", "Cabbie");
		System.out.println(automobile1);
		
		Automobile automobile2 = new Automobile (2,6,5, "Red", "Sporty");
		System.out.println(automobile2);
		
		Automobile automobile3 = new Automobile (5,6,5, "Green", "Vany");
		System.out.println(automobile3);
		
		System.out.println("\n\nMake your own car..");
		
		System.out.print("Enter a name for the car: ");
		String carName = input.nextLine();
		automobile1.setName(carName);
		
		System.out.print("Enter a color for the car: ");
		String carColor = input.nextLine();
		automobile1.setName(carColor);
		
		System.out.print("Enter number of doors: ");
		int carDoors = input.nextInt();
		automobile1.setDoors(carDoors);
		
		System.out.print("Enter number of cylinders: ");
		int carCylinders = input.nextInt();
		automobile1.setCylinder(carCylinders);
		
		System.out.print("Enter number of cylinders: ");
		int carTrans = input.nextInt();
		automobile1.setTrans(carTrans);
		
		System.out.println(automobile1);
	}

}
