package by.epam.algorythm.one_d_arr;

import java.util.Random;
import java.util.Scanner;

public class Task2
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
		
		double z = rnd.nextDouble();
		int counter = 0;
		for(int i = 0; i < n; i++)
		{
			if( arr[i] > z)
			{
				arr[i] = z;
				counter++;
			}
		}
		System.out.println(counter);
		
	}

}