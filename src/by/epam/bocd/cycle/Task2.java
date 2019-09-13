package by.epam.bocd.cycle;

import java.util.Scanner;

public class Task2
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		double h = in.nextDouble();
		
		for(double x = a; x < b; x += h)
		{
			System.out.println("y = " + (x <= 2) != null ? -x : x);
		}
		System.out.println("y = " + (b <= 2) != null ? -b : b);
	}

}
