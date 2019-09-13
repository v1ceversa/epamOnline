package by.epam.algorythm.one_d_arr;

import java.util.Random;
import java.util.Scanner;

public class Task3
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		Random rnd = new Random();
		
		double[] arr = new double[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextDouble();
		}
		
		
		int negative = 0;
		int zero = 0;
		int positive = 0;
		for(int i = 0; i < n; i++)
		{
			if(arr[i] > 0)
			{
				positive++;
			}
			else if(arr[i] < 0)
			{
				negative++;
			}
			else
			{
				zero++;
			}
		}
		System.out.println("p = " + positive + ", n = " + negative + ", z = " + zero);
		
	}

}
