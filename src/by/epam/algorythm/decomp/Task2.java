package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task2
{
	public static int _gcd(int a, int b)
	{
		if(b > a)
		{
			int tmp = a;
			a = b;
			b = tmp;
		}
		return b != 0 ? gcd(b, a%b) : a;
	}
	
	public static int gcd(int ... ds)
	{
		int n = ds.length;
		if(n < 2)
		{
			if(n == 1)
			{
				return ds[0];
			}
			return 0;
		}
		int res = _gcd(ds[0], ds[1]);
		for(int i = 2; i < n; i++)
		{
			res = _gcd(res,ds[i]);
		}
		return res;
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		System.out.println("gcd = " + gcd(a,b,c,d));
	}

}
