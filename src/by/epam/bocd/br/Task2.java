package by.epam.bocd.br;

import java.util.Scanner;

public class Task2
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		double d;
		
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		d = in.nextDouble();
		
		
		double min1 = (a < b) ? a : b;
		double min2 = (c < d) ? c : d;
		double max = (min1 > min2) ? min1 : min2;
		System.out.println("max(min(a,b),min(c,d)) = " + max);
	}

}
