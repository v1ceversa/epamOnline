package by.epam.str_and_build;

import java.util.Scanner;

public class Task8
{
	public static String biggestWord(String str)
	{
		String[] words = str.split(" ");
		int maxLength = 0;
		int maxId = 0;
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].length() > maxLength)
			{
				maxLength = words[i].length();
				maxId = i;
			}
		}
		return words[maxId];
	}
	
	
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		biggestWord(str);
		

	}

}
