package by.epam.algorythm.decomp;

import java.util.Random;


public class Task9
{
	public static double specialArea(double x, double y, double z, double t)
	{
		double area = x*y/2;
		double c = Math.sqrt(x*x + y*y);
		double semiPerimeter = (z + t + c)/2;
		area += Math.sqrt(semiPerimeter*(semiPerimeter-z)*(semiPerimeter-t)*(semiPerimeter-c));
		return area;
	}

	public static void main(String[] args)
	{
		Random rnd = new Random();
		double x = rnd.nextDouble()*1000;
		double y = rnd.nextDouble()*1000;
		double z = rnd.nextDouble()*1000;
		double t = rnd.nextDouble()*1000;
		System.out.println(specialArea(x, y, z, t));
	}

}
