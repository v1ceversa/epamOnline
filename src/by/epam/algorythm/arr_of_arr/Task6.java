package by.epam.algorythm.arr_of_arr;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Task6
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
				double y = i-(double)(n-1)/2;
				double x = j-(double)(n-1)/2;
				matrix[i][j] = (abs(y) >= abs(x)) ? 1 : 0;
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
