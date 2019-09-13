package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task13
{
	public static void twinsSearch(int n)
	{
		boolean[] arr = new boolean[2*n];
		for(int i = 2; i*i <= 2*n; i++)
		{
			if(arr[i-1] == false)
			{
				for(int j = i*i; j <= 2*n; j += i)
				{
					arr[j-1] = true;
				}
			}
		}
		
		for(int i = n - 1; i < n-2; i++)
		{
			if(arr[i] == false && arr[i+2] == false)
			{
				System.out.println(i+1 + " " + i+3);
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		twinsSearch(n);
	}

}
