package by.epam.classes.simple.task4;

import java.time.LocalTime;
import java.util.Random;

public class Train
{
	private String destination;
	private int number;
	private LocalTime departune;
	private static Random rnd = new Random(System.currentTimeMillis());
	
	Train()
	{
		for(int i = 0; i < 10; i++)
		{
			destination += 'a' + rnd.nextInt(26);
		}
		number = rnd.nextInt();
		String hour = Integer.toString(rnd.nextInt(24));
		String min = Integer.toString(rnd.nextInt(60));
		String sec = Integer.toString(rnd.nextInt(60));
		departune = LocalTime.parse(hour + ":" + min + ":" + sec);
	}
	
	Train(String destination, int number, String time)
	{
		this.destination = destination;
		this.number = number;
		this.departune = LocalTime.parse(time);
	}
	
	
	
	public static void sortByNumbers(Train[] trains)
	{
		int size = trains.length;
		for (int step = size / 2; step > 0; step /= 2)
		{
			for (int i = step; i < size; i++) 
			{   
				for (int j = i - step; j >= 0 && trains[j].number > trains[j + step].number; j -= step)
				{
					Train tmp = trains[j];
					trains[j] = trains[j + step];
					trains[j + step] = tmp;
				}
			}
		}
	}
	
	public static void informaitonByNumber(Train[] trains, int number)
	{
		for(Train tr : trains)
		{
			if(tr.number == number)
			{
				System.out.println(tr);
				break;
			}
		}
	}
	
	private int compare(Train tr)
	{
		int ans = this.destination.compareTo(tr.destination);
		return (ans == 0) ? this.departune.compareTo(tr.departune) : ans;
	}
	
	public static void sort(Train[] trains)
	{
		int size = trains.length;
		for (int step = size / 2; step > 0; step /= 2)
		{
			for (int i = step; i < size; i++) 
			{   
				for (int j = i - step; j >= 0 && trains[j].compare(trains[j + step]) == 1; j -= step)
				{
					Train tmp = trains[j];
					trains[j] = trains[j + step];
					trains[j + step] = tmp;
				}
			}
		}
	}
	
	public String toString()
	{
		return "Train #" + number + "| destination: " + destination + "| time departune:" + departune;
	}
	
}
