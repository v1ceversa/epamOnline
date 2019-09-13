package by.epam.algorythm.decomp;

import java.util.Scanner;

public class Task10
{
	public static int amountOfDigits(int n)
	{
		return (int) Math.log10(n) + 1;
	}
	
	public static byte[] toArrayOfDigits(int num)
	{
		int n = amountOfDigits(num);
		byte[] arr = new byte[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = (byte) (num % 10);
			num /= 10;
		}
		return arr;
	}
	
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		byte[] arr = toArrayOfDigits(n);
		int l = arr.length;
		for(int i = 0; i < l; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
