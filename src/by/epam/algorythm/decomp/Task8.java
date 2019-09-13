package by.epam.algorythm.decomp;

import java.util.Random;
import java.util.Scanner;

public class Task8
{
	
	public static double threeElemConsecutiveSum(double[] arr, int k)
	{
		double sum = 0;
		for(int i = k ; i < k + 3; i++) 
		{
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		double[] arr = new double[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextDouble()*1000;
		}
		int k = in.nextInt();
		System.out.println(threeElemConsecutiveSum(arr, k));
		
	}

}
