
public class RandomNumber {
	
	private int high;
	private int low;
	
	public RandomNumber (int low, int high)
	{
		this.high = high;
		this.low = low;
	}
	
	public int getANumber()
	{
		int randomNum = low + (int)(Math.random()*high);
		return randomNum;
	}
	public int getLowNumber()
	{
		return low;
	}
	public int getHighNumber()
	{
		return high;
	}

}
