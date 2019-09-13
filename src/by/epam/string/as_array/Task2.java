package by.epam.string.as_array;

public class Task2
{
	public static final int NOT_ANY_OTHERS = -1;
	
	public static int startsAt(char[] str, char[] word, int start)
	{
		for(int i = start; i <= str.length - word.length; i++) 
		{
			if(str[i] == word[0])
			{
				int j;
				for(j = 1; j < word.length; j++)
				{
					if(str[i+j] != word[j])
					{
						break;
					}
				}
				if(j == word.length)
				{
					return i;
				}
			}
		}
		return NOT_ANY_OTHERS;
	}
	
	public static int amountOfWords(char[] str, char[] word)
	{
		int amount = 0;
		int start = startsAt(str, word, 0);
		while(start != NOT_ANY_OTHERS)
		{
			amount++;
			start = startsAt(str, word, start + word.length);
		}
		return amount;
	}
	
	public static int toIndex(int from, int i, int lengthTo, int lengthFrom)
	{
		return from + i * (lengthTo - lengthFrom);
	}
	
	//overWrite
	public static char[] changeSubstring(char[] str, char[] from, char[] to )
	{
		int n1 = amountOfWords(str, from);
		int n = str.length + n1*(to.length - from.length);
		char[] nw = new char[n];
		
		
		int start = startsAt(str, from, 0);
		int prev = 0;
		for(int i = 0; start != NOT_ANY_OTHERS; i++)
		{
			int length = start - prev;
			System.arraycopy(str, prev, nw, toIndex(prev, i, to.length, from.length), length);
			System.arraycopy(to, start, nw, toIndex(start, i, to.length, from.length), to.length);
			prev = start + from.length;
			start = startsAt(str, from, prev); 
		}
		//overwrite
		return nw;
	}
	
	
	public static void main(String[] args)
	{
		

	}

}
