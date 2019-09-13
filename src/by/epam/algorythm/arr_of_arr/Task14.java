package by.epam.algorythm.arr_of_arr;


import java.util.Scanner;

public class Task14
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt();
		//correct init for n >= m
		int n = in.nextInt();
		int[][] matrix = new int[n][m];
		for(int j = 0; j < m; j++)
		{
			for(int i = 0; i < n; i++)
			{
				if(i <= j)
				matrix[i][j] = 1;
			}
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
