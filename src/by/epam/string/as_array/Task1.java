package by.epam.string.as_array;

public class Task1
{
	public static int amountOfUppercase(char[] str)
	{
		int i = 0;
		for(char a : str)
		{
			if(Character.isUpperCase(a))
			{
				i++;
			}
		}
		return i;
	}
	
	public char[] camelToSnake(char[] str)
	{
		int n1 = str.length;
		int n = amountOfUppercase(str) + n1;
		char[] nw = new char[n];
		
		int i = 0;
		for(char a : str)
		{
			if(Character.isUpperCase(a))
			{
				nw[i++] = '_';
				nw[i++] = Character.toLowerCase(a);
			}
		}
		return nw;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
