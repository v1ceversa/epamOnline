package by.epam.algorythm.decomp;

import java.util.Random;
import java.util.Scanner;

public class Task4
{
	public static final int AMOUNT_OF_DIMENSIONS = 2;
	
	public static Random rnd;
	
	public static Scanner in;
	
	public static void input(Double[][] points)
	{
		int n = points.length;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < AMOUNT_OF_DIMENSIONS; j++)
			{
				points[i][j] = rnd.nextDouble() * 1000;
			}
		}
	}
	
	public static void output(Double[][] points)
	{
		int n = points.length;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < AMOUNT_OF_DIMENSIONS; j++)
			{
				System.out.print(points[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static double length(Double[][] points, int j, int k)
	{
		double sum = 0;
		
		for(int i = 0; i < AMOUNT_OF_DIMENSIONS; i++)
		{
			sum += Math.pow(points[j][i]-points[k][i], 2);
		}
		
		return sum;
	}
	
	
	public static int[] MaxLengthPoints(Double[][] points)
	{
		int n = points.length;
		int firstMPoint = 0;
		int secondMPoint = 0;
		double maxLength = 0;
		
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				double currentLength = length(points, i, j);
				if(currentLength > maxLength)
				{
					firstMPoint = i;
					secondMPoint = j;
					maxLength = currentLength;
				}
			}
		}
		
		int[] res = {firstMPoint, secondMPoint};
		return res;
	}
	
	public static void main(String[] args)
	{
		rnd = new Random();
		in = new Scanner(System.in);
		int n = in.nextInt();
		Double[][] points = new Double[n][AMOUNT_OF_DIMENSIONS];
		input(points);
		output(points);
		System.out.println(MaxLengthPoints(points));
	}

}
