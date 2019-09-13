package by.epam.algorythm.arr_of_arr;

import java.util.Scanner;

public class Task16
{
	private static int[][] matrix;
	private static int n;
	
	private static void show()
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int sumOfRow(int i)
	{
		int sum = 0;
		for(int j = 0; j < n; j++)
		{
			sum += matrix[i][j];
		}
		return sum;
	}
	
	private static int sumOfCol(int j)
	{
		int sum = 0;
		for(int i = 0; i < n; i++)
		{
			sum += matrix[i][j];
		}
		return sum;
	}
	
	public static boolean check()
	{
		final int MAGIC_NUMBER = (n*n*n+n)/2;
		int diagonalSum = 0;		//		\-diagonal
		int orthoDiagonalSum = 0; 	//	 	/-diagonal
		for(int i = 0; i < n; i++)
		{
			if(sumOfRow(i) != MAGIC_NUMBER 
					&& sumOfCol(i) != MAGIC_NUMBER)
			{
				return false;
			}
			diagonalSum += matrix[i][i];
			orthoDiagonalSum += matrix[i][n - 1 - i];
		}
		if(orthoDiagonalSum != MAGIC_NUMBER 
				&& diagonalSum != MAGIC_NUMBER)
		{
			return false;
		}
		return true;
	}
	
	public static void showMS(int k)
	{
		if(k == n*n - 1)
		{
			if(check())
			{
				show();
			}
		}
		for(int i = k; i < n*n; i++)
		{
			int tmp = matrix[i/n][i%n];
			matrix[i/n][i%n] = matrix[k/n][k%n];
			matrix[k/n][k%n] = tmp;
			showMS(k+1);
			tmp = matrix[i/n][i%n];
			matrix[i/n][i%n] = matrix[k/n][k%n];
			matrix[k/n][k%n] = tmp;
		}
	}
	
	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		matrix = new int[n][n];
		showMS(0);
		
	}

}
