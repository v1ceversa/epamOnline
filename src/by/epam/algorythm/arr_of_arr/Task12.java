package by.epam.algorythm.arr_of_arr;

import java.util.Random;
import java.util.Scanner;

public class Task12
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
		
		for(int i = 0; i < n; i++)
		{
			//Shells sort
			
			
			// Выбор шага
			for (int step = m / 2; step > 0; step /= 2)
			{   // Перечисление элементов, которые сортируются на определённом шаге
				for (int k = step; k < m; k++)
				{
				    // Перестановка элементов внутри подсписка, пока k-тый не будет отсортирован
					for (int j = k - step; j >= 0 && matrix[i][j] > matrix[i][j + step]; j -= step)
					{
						double tmp = matrix[i][j];
						matrix[i][j] = matrix[i][j + step];
						matrix[i][j + step] = tmp;
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
