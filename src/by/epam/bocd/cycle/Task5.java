package by.epam.bocd.cycle;

import java.util.Scanner;

public class Task5
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		double e = in.nextDouble();
		double sum = 0;
		if(e > 2)
		{
			System.out.println("sum = 0");
		}
		else if(e < 1e-5)
		{
			System.out.println("sum ≈ 3.5");
		}
		else
		{
			int i = 0;
			double an = e;
			while(an >= e)
			{
				an = Math.pow(2, -i) + Math.pow(3, -i);
				sum += an;
				i++;
			}
		}
		
		
		System.out.println("Сумма: " + sum);
	}

}
