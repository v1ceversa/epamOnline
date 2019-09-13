/*
 * Navros Andrey, 09.08.2019
 * 
 * 1 Linear Program
 * Task 1
 * */

package by.epam.bocd.lp;

import java.util.Scanner;

public class Task1
{	
	public static void main(String[] args)
	{
		System.out.println("Task 1");
		System.out.println(" find: z = ((a - 3) * b / 2) + c");
		
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
		
		System.out.println("z = " + ((a-3)*b/2)+c);
	}
}
