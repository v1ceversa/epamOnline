package by.epam.algorythm.arr_of_arr;

import java.util.Scanner;

public class Task4
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				matrix[i][j] = (i%2 == 0) ? j + 1 : n - j; 
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
	}

}
