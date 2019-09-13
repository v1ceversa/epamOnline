package by.epam.str_and_build;

import java.util.Scanner;

public class Task10
{
	
	public static int amountOfSentences(String str)
	{
		System.out.println(str);
		return str.split("[.!?]").length;
	}

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		System.out.println(amountOfSentences(in.nextLine()));
	}

}
