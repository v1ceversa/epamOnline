package by.epam.bocd.cycle;

import java.math.BigInteger;

public class Task4
{

	public static void main(String[] args)
	{
		BigInteger prod = BigInteger.valueOf(1);
		
		for(int i = 1; i <= 200; i++)
		{
			prod.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("Произведение :" + prod);
	}

}
