
public class GetANumber {
	
	private int low;
	private int high;
	
	public void setLowNumber (int low)
	{
		this.low = low;
	}
	public void setHighNumber (int high)
	{
		this.high = high;
	}
	public int getHigh()
	{
		return high;
	}
	public int getLow()
	{
		return low;
	}
	
	public int getANumber()
	{
		int randomNum = low + (int)(Math.random()*high);
		return randomNum;
	}

}
