
package by.epam.classes.simple.task4;

import java.util.Scanner;

public class Task4
{
	public static final int AMOUNT_OF_TRAINS = 5;
	
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Train[] trains = new Train[AMOUNT_OF_TRAINS];
		for(int i = 0; i < AMOUNT_OF_TRAINS; i++)
		{
			trains[i] = new Train(in.nextLine(),in.nextInt(),in.nextLine());
		}
		for(Train tr: trains)
		{
			System.out.println(tr);
		}
		Train.sortByNumbers(trains);
		for(Train tr: trains)
		{
			System.out.println(tr);
		}
		Train.sort(trains);
		for(Train tr: trains)
		{
			System.out.println(tr);
		}
	}
}
