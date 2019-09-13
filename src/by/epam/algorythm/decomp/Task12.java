package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task12
{
	public static int amount(int k, int n)
	{
		int amount = 0;
		for(int i = 1; i < n; i++)
		{
			int sum = 0;
			int j = i;
			while(j > 0)
			{
				sum += j%10;
				j /= 10;
			}
			if(sum == k)
			{
				amount++;
			}
		}
		return amount;
	}
	
	public static int[] Task(int k, int n)
	{
		
		int[] arr = new int[amount(k,n)];
		int iter = 0;
		for(int i = 1; i < n; i++)
		{
			int sum = 0;
			int j = i;
			while(j > 0)
			{
				sum += j%10;
				j /= 10;
			}
			if(sum == k)
			{
				arr[iter++] = i;
			}
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		int[] arr = Task(k, n);
		int m = arr.length;
		for(int i = 0; i < m; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
