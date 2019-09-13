package by.epam.algorythm.sort;

import java.util.Random;
import java.util.Scanner;

public class Task7
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		int m = in.nextInt();
		double[] a = new double[n];
		double[] b = new double[m];
		int j = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = rnd.nextDouble() + ((i == 0) ? 0 : a[i-1]);
		}
		for(int i = 0; i < m; i++)
		{
			b[i] = rnd.nextDouble() + ((i == 0) ? 0 : b[i-1]);
		}
		for(int i = 0; i < n; i++)
		{
			if(a[i] > b[j])
			{
				System.out.print(++j + " ");
			}
		}
		while(j < m)
		{
			System.out.print(++j + " ");
		}

	}

}
