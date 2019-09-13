package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task15
{
	
	public static boolean check(int n)
	{
		int cur = 0;
		int prev = Integer.MAX_VALUE;
		
		while(n > 0)
		{
			cur = n % 10;
			
			if(cur >= prev)
			{
				return false;
			}
			
			n /= 10;
		}
		
		return true;
	}
	
	public static void increasingDigits(int numDig)
	{
		int n = (int) Math.pow(10, numDig + 1); // unreachable limit
		int i = (int) Math.pow(10, numDig); 	// first n-digits number
		for(; i < n; i++)
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
		int n = in.nextInt();
		increasingDigits(n);
	}

}
