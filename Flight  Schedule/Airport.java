import java.lang.*;

public class Airport 
{
	private String name;
	private Coordinate[] location;

	Airport()
	{
		System.out.println();
	}
	Airport(String name, int arraySizeOfLocation)
	{
		this.name name;
		this.location = new Coordinate[arraySizeOfLocation];
	}
	public void setName(String name)
	{
		this.name name;
	}
	public void setLocation(Coordinate[] location)
	{
		this.location = new Coordinate[arraySizeOfLocation];
	}
	public String getName()
	{
		return name;
	}
	public Coordinate getLocation()
	{
		return location;
	}

}