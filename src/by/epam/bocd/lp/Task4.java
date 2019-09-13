/*
 * Navros Andrey, 09.08.2019
 * 
 * 1 Linear Program
 * Task 4
 * */

package by.epam.bocd.lp;

import java.util.Scanner;

public class Task4
{
	public static void main(String[] args)
	{
		System.out.println("Task 4");
		System.out.println(" let real number at format of nnn.ddd exchange nnn & ddd parts");

		double nnnddd;

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Enter double value in format of nnn.ddd: ");
		nnnddd = in.nextDouble();

		int nnn = (int) nnnddd;
		int ddd = (int) (nnnddd * 1000) % 1000;
		double dddnnn = ddd + (double) nnn / 1000;

		System.out.println("ddd.nnn = " + dddnnn);
	}
}