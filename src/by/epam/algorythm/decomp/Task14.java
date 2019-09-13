package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task14
{
	public static int amountOfDigits(int num)
	{
		return (int) Math.log10(num) + 1;
	}
	
	public static boolean check(int num)
	{
		int n = amountOfDigits(num);
		int sum = 0;
		int someCopy = num;
		for(int i = 0; i < n; i++)
		{
			sum += Math.pow(someCopy%10, n);
			someCopy /= 10;
		}
		return sum == num ? true : false;
	}
	
	public static void narcissisticNumbersSearch(int limit) 
	{
		for(int i = 1; i <= limit; i++)
		{
			if(check(i))
			{
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		narcissisticNumbersSearch(k);

	}

}
