package by.epam.algorythm.one_d_arr;

import java.util.Random;
import java.util.Scanner;

public class Task9
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) 
		{
			arr[i] = rnd.nextInt();
		}
		int maxTimes = 0;
		int id = 0;
		for(int i = 0; i < n; i++) 
		{
			int times = 0;
			for(int j = i; times + n - j > maxTimes; j++)
			{
				if(arr[i] == arr[j])
				{
					times++;
				}
			}
			if(maxTimes == times && arr[i] < arr[id])
			{
				id = i;
			}
			else if(maxTimes < times)
			{
				maxTimes = times;
				id = i;
			}
		}
		System.out.println("element: " + arr[id] + ", times:" + maxTimes);
	}

}
