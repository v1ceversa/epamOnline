package by.epam.bocd.cycle;

import java.util.Scanner;

public class Task1
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		long a = in.nextLong();
		long sum = 0;
		for(long i = a; i > 0;  i--)
		{
			sum += i;
		}
		System.out.println("Сумма :" + sum);
	}

}
