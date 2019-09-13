package by.epam.str_and_build;

import java.util.Scanner;

public class Task5
{
	
	public static int amountOfSubstrings(String str, String sub)
	{
		int amount = 0;
		int start = str.indexOf(sub,0);
		while(start == -1) 
		{
			amount++;
			start = str.indexOf(sub,start + sub.length());
		}
		return amount;
	}

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String sub = in.nextLine();
		System.out.println(amountOfSubstrings(str, sub));

	}

}
