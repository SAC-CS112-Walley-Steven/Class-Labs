
public class RandomNumber {
	
	private int high;
	
	public RandomNumber (int high)
	{
		this.high = high;
	}
	
	public int getANumber()
	{
		int randomNum = 1 + (int)(Math.random()*high);
		return randomNum;
	}

}
