import java.lang.*;

public class Schedule 
{
	private hour;
	private minute;

	Schedule()
	{
		System.out.println();
	}
	Schedule(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	public void setMinute(int minute)
	{
		this.minute = minute
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	
}