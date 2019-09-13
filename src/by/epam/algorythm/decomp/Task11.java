package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task11
{
	public static int amountOfDigits(int n)
	{
		return (int) Math.log10(n) + 1;
	}
	
	public static int compare(int num1, int num2)
	{
		int l = amountOfDigits(num1);
		int r = amountOfDigits(num2);
		return l-r;
	}
	
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int ans = compare(n1, n2);
		if(ans > 0)
		{
			System.out.println("more");
		}
		else if(ans < 0)
		{
			System.out.println("less");
		}
		else
		{
			System.out.println("equal");
		}
	}
}
