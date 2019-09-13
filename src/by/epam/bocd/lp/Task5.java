package by.epam.bocd.lp;

import java.util.Scanner;

public class Task5
{
	public static void main(String[] args)
	{
		System.out.println("Task 5");
		System.out.println("Take time in sec as input and give time in HH:MM:SS format");

		int time;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		time = in.nextInt();

		int sec;
		int min;
		int hour;

		sec = time % 60;
		min = time / 60 % 60;
		hour = time / 3600;

		System.out.println(hour + "ч " + min + "мин " + sec + "с.");
	}

}
