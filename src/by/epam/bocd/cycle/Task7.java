package by.epam.bocd.cycle;

import java.util.Scanner;

public class Task7
{

	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		for(int i = n; i <= m; i++)
		{
			System.out.println("For " + i + ":");
			for(int j = (int)Math.sqrt(i); j >= 2; j--)
			{
				if(i % j == 0)
				{
					if(j*j != i)
					{
						System.out.println( j + ", " + i/j); // вывожу два делителя
					}
					else
					{
						System.out.println( j );
					}
				}
			}
			System.out.println();
		}
	}

}
