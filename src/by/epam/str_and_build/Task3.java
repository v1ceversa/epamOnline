package by.epam.str_and_build;

public class Task3
{
	
	public static String reverse(String str)
	{
		StringBuffer rev = new StringBuffer(str);
		return new String(rev.reverse());
	}
	
	public static boolean isPalindrome(String str)
	{
		return str.regionMatches(true, 0, reverse(str), 0, str.length()/2);
	}

	public static void main(String[] args)
	{
		

	}

}
