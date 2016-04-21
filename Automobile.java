
public class Automobile {
	
	private int doors;
	private int cylinders;
	private int transmission;
	private String color;
	private String name;
	
	public Automobile (int doors, int cylinder, int trans, String color, String name)
	{
		this.doors=doors;
		this.cylinders = cylinder;
		transmission = trans;
		this.color = color;
		this.name = name;
	}
	public void setDoors(int doors)
	{
		this.doors = doors;
	}
	public void setCylinder(int cylinder)
	{
		this.doors = doors;
	}
	public void setTrans(int trans)
	{
		this.transmission = trans;
	}
	public void setColor (String color)
	{
		this.color = color;
	}
	public void setName (String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return String.format("\nAutomobile features:\nDoors: %d\nCylinders: %d\nTransmition: %d speed\nColor: %s\nName: %s",
				doors, cylinders, transmission, color, name);
	}
	
}
