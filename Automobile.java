
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

	public String toString()
	{
		return String.format("\nThis automobile has:\n%d doors\n%d cylinders\n%d speed transmition\n%s in color\n%s is the name",
				doors, cylinders, transmission, color, name);
	}
}
