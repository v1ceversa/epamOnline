package by.epam.algorythm.arr_of_arr;

import java.util.Scanner;

public class Task7
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[][] matrix = new double[n][n];
		int amountOfNegative = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				matrix[i][j] = Math.sin((i*i-j*j)/n);
				if(matrix[i][j] > 0)
				{
					amountOfNegative++;
				}
			}
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(amountOfNegative);
	}

}
