import java.lang.*;

public class Flight 
{
	private String flightID;
	private int capacity;
	private Airport departureFrom;
	private Schedule[] departureTime;
	private Airport[] flyingTo;
	private Schedule[] arriveTime;

	Flight()
	{
		System.out.println();
	}
	Flight(String flightID, int capacity, Airport departureFrom, int arraySizeOfDepartureTime, int arraySizeOfFlyingTo, int arraySizeOfArriveTime)
	{
		this.flightID = flightID;
		this.capacity = capacity;
		this.departureFrom = departureFrom;
		this.departureTime = new Schedule[arraySizeOfDepartureTime];
		this.flyingTo = new Airport[arraySizeOfFlyingTo];
		this.arriveTime = new Schedule[arraySizeOfArriveTime];
	}
	public void setFlightID(String flightID)
	{
		this.flightID = flightID;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public void setDepartureFrom(Airport departureFrom)
	{
		this.departureFrom = departureFrom;
	}
	/*public void setDepartureTime(Schedule[] setDepartureTime)
	{
		this.departureTime = new Schedule[arraySizeOfDepartureTime];
	}
	public void setFlyingTo(Airport[] flyingTo)
	{
		this.flyingTo = new Airport[arraySizeOfFlyingTo];
	}
	public void setArriveTime(Schedule[] arriveTime)
	{
		this.arriveTime = new Schedule[arraySizeOfArriveTime];
	}*/

	public String getFlightID()
	{
		return flightID;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public Airport getDepartureFrom()
	{
		return departureFrom;
	}
	/*public Schedule getDepartureTime()
	{
		return departureTime;
	}
	public Airport getFlightTo()
	{
		return flyingTo;
	}
	public Schedule getArriveTime()
	{
		return arriveTime;
	}*/

	

}

