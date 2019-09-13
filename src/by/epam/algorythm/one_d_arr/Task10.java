package by.epam.algorythm.one_d_arr;

import java.util.Random;
import java.util.Scanner;

public class Task10
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextInt();
		}
		for(int i = 0; 2*i < n; i++)
		{
			arr[i] = arr[2*i];
		}
		for(int i = n/2; i > 0; i--)
		{
			arr[n - i] = 0;
		}
		for(int i = 0; i < n; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
