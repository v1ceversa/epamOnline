package by.epam.str_and_build;

public class Task6
{
	
	public static String eachSymbolTwice(String str)
	{
		String twice = "";
		for(int i = 0; i < str.length(); i++)
		{
			twice = twice + str.charAt(i) + str.charAt(i); 
		}
		return twice;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
