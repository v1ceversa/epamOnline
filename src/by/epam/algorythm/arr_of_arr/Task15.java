package by.epam.algorythm.arr_of_arr;

import java.util.Random;
import java.util.Scanner;

public class Task15
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
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		double max = Double.MIN_VALUE;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				if(max < matrix[i][j]) 
				{
					max = matrix[i][j];
				}
			}
		}
		
		//index from 1 to n
		for(int i = 0; 2*i < n; i++)
		{
			matrix[(2*i)/n][(2*i)%n] = max;
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
