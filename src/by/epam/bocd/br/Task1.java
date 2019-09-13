package by.epam.bocd.br;

import java.util.Scanner;

public class Task1
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		double angle1;
		double angle2;
		
		angle1 = in.nextDouble();
		angle2 = in.nextDouble();
		System.out.print("Такой треугольник");
		if(angle1 + angle2 < 180)
		{
			System.out.print("существует.");
			if(angle1 + angle2 == 90 || angle1 == 90 || angle2 == 90)
			{
				System.out.println("и является прямоугольным.");
			}
			else
			{
				System.out.println();
			}
		}
		else
		{
			System.out.println("не существует.");
		}
	}

}
