/*
 * Navros Andrey, 09.08.2019
 * 
 * 1 Linear Program
 * Task 2
 * */

package by.epam.bocd.lp;

import java.util.Scanner;


public class Task2
{
	public static void main(String[] args)
	{
		System.out.println("Task 2");
		System.out.println("find: z = b + (b^2+4ac)^0.5/(2a) - a^3c + b^-2");
		
		double a;
		double b; 
		double c;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter double value a:");
		a = in.nextDouble();
		System.out.println("Enter double value b:");
		b = in.nextDouble();
		System.out.println("Enter double value c:");
		c = in.nextDouble();
		double z = (b+Math.sqrt(b*b+4*a*c))/(2*a) - a*a*a*c - 1./(b*b);
		System.out.println("z = " + z);	
	}
}