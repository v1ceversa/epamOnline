package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task3
{

	public static double hexArea(double a)
	{
		return 3*a*a*Math.sin(Math.PI/3);
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		System.out.println("Area of hex is equal to " + hexArea(a));

	}

}
