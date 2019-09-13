package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task16
{

	public static boolean check(int n)
	{
		int cur = 0;
		
		while(n > 0)
		{
			cur = n % 10;
			
			if(cur%2 == 0)
			{
				return false;
			}
			
			n /= 10;
		}
		
		return true;
	}
	
	public static void sumOddDigit(int numDig)
	{
		int n = (int) Math.pow(10, numDig + 1); // unreachable limit
		int i = (int) Math.pow(10, numDig);		// first n-digits number
		int sum = 0;
		for(; i < n; i++)
		{
			if(check(i))
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		sumOddDigit(n);
	}


}
