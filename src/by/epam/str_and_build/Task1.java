package by.epam.str_and_build;

public class Task1
{
	public static int largestSeriesOfBlanks(String str)
	{
		if(str == null || str.equals(""))
		{
			return -1;
		}
		int maxAmount = 0;
		int prevStart = 0;
		int start = str.indexOf("\\s",0);
		int amount = 0;
		while(start != -1)
		{
			prevStart = start;
			start = str.indexOf("\\s",start+1);
			if(start - prevStart != 1)
			{
				if(maxAmount < amount) 
				{
					maxAmount = amount;
					amount = 0;
				}
			}
		}
		return maxAmount;
	}
	
	public static void main(String[] args)
	{
		
		
		
	}

}
