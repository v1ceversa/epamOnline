package by.epam.algorythm.decomp;

public class Task7
{
	//Horner's method for sum of odd factorial
	public static int sumOfOddFactorial(int limit, int n)
	{
		if(limit == 1 || n == limit + 2)
		{
			return 1;
		}
		return 1+n*(n-1)*sumOfOddFactorial(limit, n + 2);
	}
	
	public static int sumOfOddFactorial(int limit)
	{
		return sumOfOddFactorial(limit,3);
	}
	
	public static void main(String[] args)
	{
		System.out.println(sumOfOddFactorial(9));
	}

}
