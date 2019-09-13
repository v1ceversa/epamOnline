package by.epam.algorythm.arr_of_arr;

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
		int m = in.nextInt();
		double[][] matrix = new double[n][m];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				matrix[i][j] = rnd.nextDouble();
			}
		}
		for(int j = 0; 2*j < m; j++) 
		{		
			if(matrix[0][2*j] > matrix[n-1][2*j])
			{
				for(int i = 0; i < n; i++) 
				{
					System.out.print(matrix[i][2*j] + " ");
				}
				System.out.println();
			}
		}

	}

}
