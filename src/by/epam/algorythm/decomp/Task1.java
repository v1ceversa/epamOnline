package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task1
{
	
	public static int gcd(int a, int b)
	{
		if(b > a)
		{
			int tmp = a;
			a = b;
			b = tmp;
		}
		return b != 0 ? gcd(b, a%b) : a;
	}
	
	public static int lcm(int a, int b)
	{
		return a*b/gcd(a,b);
	}

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("lcm(" + a + ", " + b + ") = " + lcm(a,b));
	}

}
