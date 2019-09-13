package by.epam.algorythm.sort;

import java.util.Random;
import java.util.Scanner;

public class Task8
{
	public static int gcd(int a , int b)
	{
		if(a < b)
		{
			int tmp = a;
			a = b;
			b = tmp;
		}
		return (b != 0) ? gcd(b, a % b) : a;
	}
	
	public static int lcd(int a, int b) 
	{
		return a*b/gcd(a,b);
	}
	
	public static int commonDenominator(int[] arr)
	{
		int n = arr.length;
		if(n == 1)
		{
			return arr[0];
		}
		int cD = lcd(arr[0], arr[1]);
		for(int i = 2; i < n; i++)
		{
			cD = lcd(cD, arr[i]);
		}
		return cD;
	}
	
	public static void ShellSort(int[] arr)
	{
		int n = arr.length;
		int tmp;
		for (int step = n / 2; step > 0; step /= 2)
		{
			for (int i = step; i < n; i++)
			{
				for (int j = i - step; j >= 0 && arr[j] > arr[j + step]; j -= step)
				{
					tmp = arr[j];
					arr[j] = arr[j + step];
					arr[j + step] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		
		int n = in.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			p[i] = rnd.nextInt();
			q[i] = rnd.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(p[i] + "/" + q[i] + " ");
		}
		System.out.println();
		
		int cD = commonDenominator(q);
		for(int i = 0; i < n; i++)
		{
			p[i] *= cD/q[i];
		}
		
		ShellSort(p);
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(p[i] + "/" + cD + " ");
		}
		System.out.println();
	}

}
