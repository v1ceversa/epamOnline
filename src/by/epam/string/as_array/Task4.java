package by.epam.string.as_array;

public class Task4
{
	public static int amountOfDigits(char[] str)
	{
		int amount = 0;
		for(int i = 0; i < str.length; i++)
		{
			if(Character.isDigit(str[i]))
			{
				for(i++; i < str.length; i++)
				{
					if(!Character.isDigit(str[i]))
					{
						break;
					}
				}
				amount++;
			}
		}
		return amount;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
