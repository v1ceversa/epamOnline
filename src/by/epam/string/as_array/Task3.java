package by.epam.string.as_array;

public class Task3
{
	
	public static int amountOfDigits(char[] str)
	{
		int amount = 0;
		for(char a : str)
		{
			if(Character.isDigit(a))
			{
				amount++;
			}
		}
		return amount;
	}

	public static void main(String[] args)
	{
		

	}

}
