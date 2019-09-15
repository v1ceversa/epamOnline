package by.epam.classes.simple.task3;

import java.util.Random;

public class Student
{
	private String surname;
	private String initials;
	private int groupNumber;
	private byte[] performance;
	private static Random rnd = new Random(System.currentTimeMillis());
	
	Student()
	{
		for(int i = 0; i < 10; i++)
		{
			surname += 'a' + rnd.nextInt(26);
		}
		initials += 'A' + rnd.nextInt(26);
		initials += '.';
		initials += 'A' + rnd.nextInt(26);
		groupNumber = rnd.nextInt(10)+1;
		performance = new byte[5];
		for(int i = 0; i < 5; i++)
		{
			performance[i] = (byte)(rnd.nextInt(10) + 1);
		}
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getInitials()
	{
		return initials;
	}

	public void setInitials(String initials)
	{
		this.initials = initials;
	}

	public int getGroupNumber()
	{
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber)
	{
		this.groupNumber = groupNumber;
	}

	public byte[] getPerformance()
	{
		return performance;
	}

	public void setPerformance(byte[] performance)
	{
		this.performance = performance;
	}
	
	
	
}
