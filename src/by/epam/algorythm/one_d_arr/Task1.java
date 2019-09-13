package by.epam.algorythm.one_d_arr;

import java.util.Random;
import java.util.Scanner;

public class Task1
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];	
		Random rnd = new Random();
		for(int i = 0; i < n; i++)
		{
			a[i] = rnd.nextInt(Integer.MAX_VALUE/n);
		}
		int k = in.nextInt(n) + 1;
		int sum = 0;
		for(int i = 1; i * k - 1 < n; i++)
		{
			System.out.println(a[i * k - 1]);
			sum += a[i * k - 1];
		}
		System.out.println("sum = " + sum);
	}

}
