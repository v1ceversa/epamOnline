package by.epam.algorythm.arr_of_arr;

import java.util.Random;

public class Task11
{

	public static void main(String[] args)
	{
		Random rnd = new Random();
		final int MAX = 16;
		final int ROWS = 10;
		final int COLS = 20;
		int[][] matrix = new int[ROWS][COLS];
		for(int i = 0; i < ROWS; i++)
		{
			for(int j = 0; j < COLS; j++)
			{
				matrix[i][j] = rnd.nextInt(MAX);
			}
		}
		for(int i = 0; i < ROWS; i++)
		{
			for(int j = 0; j < COLS; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < ROWS; i++)
		{
			int counter = 0;
			for(int j = 0; j < COLS; j++)
			{
				if(matrix[i][j] == 5)
				{
					counter++;
				}
			}
			if(counter >= 3) 
			{
				System.out.print(i+1 + " ");
			}
		}
		System.out.println();
	}

}
