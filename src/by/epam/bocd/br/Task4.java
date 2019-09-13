package by.epam.bocd.br;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task4
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		double A = in.nextDouble();
		double B = in.nextDouble();
		
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		
		if (x >= y && x >= z)
		{
			if (min(A, B) > min(y, z) && max(A, B) > max(y, z))
			{
				System.out.println("Можно просунуть кирпич.");
			}
			else
			{
				System.out.println("Нельзя просунуть кирпич.");
			}
		}
		else if(y >= x && y >= z)
		{
			if (min(A, B) > min(x, z) && max(A, B) > max(x, z))
			{
				System.out.println("Можно просунуть кирпич.");
			}
			else
			{
				System.out.println("Нельзя просунуть кирпич.");
			}
		}
		else
		{
			if (min(A, B) > min(x, y) && max(A, B) > max(x, y))
			{
				System.out.println("Можно просунуть кирпич.");
			}
			else
			{
				System.out.println("Нельзя просунуть кирпич.");
			}
		}
	}

}
