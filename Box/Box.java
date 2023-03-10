import java.lang.*;
public class Box
{
	private double length;
	private double width;
	private double height;

/*
1. method name.           setLength
2. method parameter.      (double l)
3. method return type.     void
4. method body.            { ---- }
*/

	public void setLength(double l)
	{
		length = l;
	}
	public void setWidth(double w)
	{
		width = w;
	}
	public void setHeight(double h)
	{
		height = h;
	}

/*
1. method name.           getLength
2. method return type.    double
3. method parameter.      ()
4. method body.            { return  ---- }
*/

	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}

	public static void main(String[] args)
	{
		Box b = new Box();

		b.setLength(1.5);
		b.setWidth(1.2);
		b.setHeight(1.1);

		System.out.println(" Length is :  "+b.getLength());
		System.out.println(" Wigth is :  "+b.getWidth());
		System.out.println(" Height is :  "+b.getHeight());
	}
}
