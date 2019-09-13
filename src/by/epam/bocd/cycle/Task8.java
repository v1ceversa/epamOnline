package by.epam.bocd.cycle;

import java.util.Scanner;

public class Task8
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		for(int i = n; i > 0; i /= 10)
		{
			int digit1 = i % 10;
			int amount = 0;
			for(int j = n, k = 0; j > 0; j /= 10, k++)
			{
				int digit2 = j % 10;
				if(digit1 == digit2)
				{
					amount++;
					if(amount != 1)
					{
						n -= digit1*Math.pow(10, k);
						int nextDigits = (int) (n / Math.pow(10, k+1));
						n -= nextDigits*Math.pow(10, k+1);
						n += nextDigits*Math.pow(10, k);
						k--;
					}
				}
				
			}
		}
		
		for(int i = n; i > 0; i /= 10)
		{
			int digit1 = i % 10;
			for(int j = m; j > 0; j /= 10)
			{
				int digit2 = j % 10;
				if(digit1 == digit2)
				{
					System.out.print(digit1 + " ");
					break;
				}
				
			}
		}
		
		System.out.println();
		
	}

}
