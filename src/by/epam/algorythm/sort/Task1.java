package by.epam.algorythm.sort;

import java.util.Random;
import java.util.Scanner;

public class Task1
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		int[] first = new int[n];
		for(int i = 0; i < n; i++)
		{
			first[i] = rnd.nextInt();
		}
		int m = in.nextInt();
		int[] second = new int[m];
		for(int i = 0; i < n; i++)
		{
			second[i] = rnd.nextInt();
		}
		int[] result = new int[n+m];
		int k = in.nextInt();
		int l = result.length;
		for(int i = 0; i < l; i++)
		{
			if(i >= k)
			{
				result[i] = (i >= k + m) ? first[i-m] : second[i-k]; 
			}
			else
			{
				result[i] = first[i];
			}
		}
				
	}

}
