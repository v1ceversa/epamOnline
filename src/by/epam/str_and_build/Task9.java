package by.epam.str_and_build;

import java.util.Scanner;

public class Task9
{
	public static boolean isEnglish(char ch)
	{
		return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
	}
	
	public static int[] lowerAndUppercase(String str)
	{
		int[] ans = {0, 0};
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(isEnglish(ch))
			{
				if(Character.isLowerCase(ch))
				{
					ans[0]++;
				}
				else
				{
					ans[1]++;
				}
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		lowerAndUppercase(str);

	}

}
