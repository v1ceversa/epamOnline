package by.epam.str_and_build;

import java.util.Scanner;

public class Task7
{

	public static String removeUselessStuff(String str)
	{
		str = str.replaceAll(" ","");
		for(int i = 0; i < str.length(); i++)
		{
			str = str.substring(0, i+1) + str.substring(i+1).replaceAll(str.substring(i, i+1), "");
		}
		return str;
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String str2 = removeUselessStuff(str);
		System.out.println(str+"/////////"+str2);
	}

}
