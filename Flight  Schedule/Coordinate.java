import java.lang.*;

public class Coordinate 
{
	private double longitude;
	private double latitude;

	Coordinate()
	{
		System.out.println();
	}
	Coordinate(double longitude, double latitude)
	{
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public void setLongitude(double longitude)
	{
		this.longitude = longitude;
	}
	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}

	public double getLogitude()
	{
		return longitude;
	}
	public double getLatitude()
	{
		return latitude;
	}

}