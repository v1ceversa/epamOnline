package by.epam.bocd.lp;

import java.util.Scanner;

public class Task6
{

	public static void main(String[] args)
	{
		System.out.println("Task 6");
		System.out.println("Check: Point are inside of certain area?");

		double x;
		double y;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Type x coordinate");
		x = in.nextDouble();
		System.out.println("Type y coordinate");
		y = in.nextDouble();

		boolean answer = (x >= -4 && x <= 4 && y >= -3 && y <= 0) 
				|| (-2 <= x && x <= 2 && 0 <= y && y <= 4);
		System.out.println(answer);
	}

}
