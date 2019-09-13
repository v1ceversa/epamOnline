package by.epam.bocd.br;

import java.util.Scanner;

public class Task5
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		double x = in.nextDouble();
		double Fx = (x <= 3) ? x*x + 3*x + 9 : 1/(x*x*x + 6);
		System.out.println("F(x) = " + Fx);
	}

}
