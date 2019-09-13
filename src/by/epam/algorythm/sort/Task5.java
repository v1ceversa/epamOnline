package by.epam.algorythm.sort;

import java.util.Random;
import java.util.Scanner;

public class Task5
{
	public static int binarySearch(int a[], int k) 
	{ 
		int l = 0; 
		int r = k - 1;
		while(l < r)
		{
			int mid = (l + r)/2; 
			
		    if(a[k] > a[mid]) 
		    {
		    	l = mid + 1;
		    }
		    else if(a[k] == a[mid]) 
		    {
		    	return mid+1;
		    } 
		    else 
		    {
		    	r = mid - 1;
		    }
		}
		return (a[k] > a[l]) ? (l + 1) : l;
	}
	
	public static void insertionSort(int[] arr)
	{
		int n = arr.length;
		for(int i = 1; i < n; i++)
		{
			int tmp = arr[i];
			
			int minId = binarySearch(arr, i) ;
			for(int j = i - 1; j >= minId;  j--)
			{
				arr[j + 1] = arr[j];
			}
			arr[minId] = tmp;
		}
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = rnd.nextInt()%1000;
		}
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		insertionSort(arr);
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
