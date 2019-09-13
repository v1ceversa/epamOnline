package by.epam.string.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1
{
	
	
	
	
	public static String perhapsSort(String text)
	{
		String[] perh = text.split("(?<=\n)");
		int n = perh.length;
		int[] amountOfSentences = new int[n];
		for(int i = 0; i < n; i++)
		{
			amountOfSentences[i] = perh[i].split("(?<=[.!?])").length;
		}
		
		for (int step = n / 2; step > 0; step /= 2)
		{    
			for (int i = step; i < n; i++)
			{
				for (int j = i - step; j >= 0 && amountOfSentences[j] > amountOfSentences[j + step]; j -= step)
				{
					int tmp1 = amountOfSentences[j];
					amountOfSentences[j] = amountOfSentences[j + step];
					amountOfSentences[j + step] = tmp1;
					String tmp = perh[j];
					perh[j] = perh[j + step];
					perh[j + step] = tmp;
				}
			}
		}
		
		text = "";
		for(int i = 0; i < n; i++)
		{
			text += perh[i];
		}
		return text;
	}
	
	public static void sort2(String[] words,char ch)
	{
		int n = words.length;
		for (int step = n / 2; step > 0; step /= 2)
		{    
			for (int i = step; i < n; i++)
			{
				for (int j = i - step; j >= 0 && words[j].length() > words[j + step].length(); j -= step)
				{
					
					String tmp = words[j];
					words[j] = words[j + step];
					words[j + step] = tmp;
				}
			}
		}
	}
	
	public static String wordsSort1(String text)
	{
		String ans = "";
		Pattern pat = Pattern.compile(".+?[.!?]");
		Matcher mat = pat.matcher(text);
		
		while(mat.find())
		{
			String sentence = mat.group();
			String[] words = sentence.split("\\W+");
			String[] delimeters = sentence.split("\\w+");
			int n = words.length + delimeters.length;
			sentence = "";
			int j = 0;
			int k = 0;
			for(int i = 0; i < n; i++)
			{
				sentence += isDelimNext(n, i) ? delimeters[j++] : words[k++];
			}
			ans += sentence; 
		}
		
		return ans;
	}
	
	public static int amountOfCertainSymbol(String word, Character ch)
	{
		int amount = 0;
		Pattern pat = Pattern.compile(ch.toString());
		Matcher mat = pat.matcher(word);
		while(mat.find())
		{
			amount++;
		}
		return amount;
	}
	
	//Is j-word more than j+step - word
	public static boolean compareWords(String[] words,Character ch, int j , int i)
	{
		int amountJ = amountOfCertainSymbol(words[j], ch);
		int amountI = amountOfCertainSymbol(words[i], ch);
		return amountJ < amountI || (amountJ == amountI && words[j].compareTo(words[i]) > 0);
	}
		
	public static boolean isDelimNext(int n, int i)
	{
		return (n%2 != 0 && i%2 == 0) || (n%2 == 0 && i%2 != 0);
	}
	
	public static void sort3(String[] words,char ch)
	{
		int n = words.length;
		for (int step = n / 2; step > 0; step /= 2)
		{    
			for (int i = step; i < n; i++)
			{
				for (int j = i - step; j >= 0 && compareWords(words, ch, j, j + step); j -= step)
				{
					
					String tmp = words[j];
					words[j] = words[j + step];
					words[j + step] = tmp;
				}
			}
		}
	}
	
	public static String wordsSort2(String text, char ch)
	{
		String ans = "";
		Pattern pat = Pattern.compile(".+?[.!?]");
		Matcher mat = pat.matcher(text);
		while(mat.find())
		{
			String sentence = mat.group();
			String[] words = sentence.split("\\W+");
			String[] delimeters = sentence.split("\\w+");
			sort3(words,ch);
			int n = words.length + delimeters.length;
			sentence = "";
			int j = 0;
			int k = 0;
			for(int i = 0; i < n; i++)
			{
				sentence += isDelimNext(n, i) ? delimeters[j++] : words[k++];
			}
			ans += sentence; 
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		
	}

}
