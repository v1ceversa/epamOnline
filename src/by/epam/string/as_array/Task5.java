package by.epam.string.as_array;

public class Task5
{
	public static int amountOfUselessBlanks(char[] str)
	{
		int amount = 0;
		for(int i = 0; i < str.length; i++)
		{
			if(Character.isWhitespace(str[i]))
			{
				for(i++; i < str.length; i++)
				{
					if(!Character.isWhitespace(str[i]))
					{
						break;
					}
					amount++;
				}
			}
		}
		return amount;
	}
	
	public static char[] deleteUselessBlanks(char[] str)
	{
		int n = amountOfUselessBlanks(str);
		char[] nw = new char[n];
		for(int i = 0, j = 0; i < str.length; i++, j++)
		{
			nw[j] = str[i];
			if(Character.isWhitespace(str[i]))
			{
				
				for(i++; i < str.length; i++)
				{
					if(!Character.isWhitespace(str[i]))
					{
						nw[j] = str[i];
						break;
					}
				}
			}
			
		}
		return nw;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
