/*
 * Navros Andrey, 09.08.2019
 * 
 * 1 Linear Program
 * Task 3
 * */

package by.epam.bocd.lp;

import java.util.Scanner;

public class Task3
{	
	public static void main(String[] args)
	{
		System.out.println("Task 3");
		System.out.println(" find: z = (sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y)");	
		
		double x;
		double y;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter double value x:");
		x = in.nextDouble();
		System.out.println("Enter double value y:");
		y = in.nextDouble();
		double z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
		System.out.println("z = " + z);
	}
}
