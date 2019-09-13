package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task17
{
	public static int sumOfDigits(int n)
	{
		int sum = 0;
		while(n > 0)
		{
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	public static int func(int n, int i)
	{
		return (n == 0) ? i : func(n-sumOfDigits(n),++i);
	}
	
	public static int func(int n)
	{
		return func(n, 0);
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(func(n,0));
	}

}
