package by.epam.algorythm.arr_of_arr;

import java.util.Random;
import java.util.Scanner;

public class Task13
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		final int n = in.nextInt();
		final int m = in.nextInt();
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
		
		for(int j = 0; j < n; j++)
		{
			//Shells sort
			
			
			// ����� ����
			for (int step = n / 2; step > 0; step /= 2)
			{   // ������������ ���������, ������� ����������� �� ����������� ����
				for (int k = step; k < n; k++)
				{
				    // ������������ ��������� ������ ���������, ���� k-��� �� ����� ������������
					for (int i = k - step; i >= 0 && matrix[i][j] > matrix[i + step][j]; i -= step)
					{
						double tmp = matrix[i][j];
						matrix[i][j] = matrix[i + step][j];
						matrix[i + step][j] = tmp;
					}
				}
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
