package by.epam.algorythm.decomp;

import java.util.Random;
import java.util.Scanner;

public class Task5
{
	public static int previousMaxEl(int[] a)
	{
		int n = a.length;
		int max = Integer.MIN_VALUE;
		int Id = 0;
		int prevId = 0;
		for(int i = 0; i < n; i++)
		{
			if(max < a[i])
			{
				prevId = Id;
				max = a[i];
				Id = i;
			}
		}
		return prevId;
	}
	
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
		System.out.println(arr[previousMaxEl(arr)]);
	}

}
