package by.epam.classes.simple.task1;

public class Test1
{
	private double x;
	private double y;
	
	Test1()
	{
		super();
		x = 0;
		y = 0;
	}
	
	Test1(double x, double y)
	{
		super();
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public double getX()
	{
		return x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public double getY()
	{
		return y;
	}
	
	public String toString()
	{
		return "x: " + x + ", y: " + y;
	}
	
	public void output()
	{
		System.out.println(this);
	}
	
	public double sum()
	{
		return x + y;
	}
	
	public double max()
	{
		return Math.max(x, y);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
