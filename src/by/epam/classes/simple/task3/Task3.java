package by.epam.classes.simple.task3;

public class Task3
{
	public final static double MIN_MARK_FOR_NERD = 9;
	public final static int AMOUNT_OF_STUDENTS = 10;
	
	public static void uberStudents(Student[] students)
	{
		boolean nerd;
		for(Student student : students)
		{
			nerd = true;
			for(byte mark : student.getPerformance())
			{
				if(mark < MIN_MARK_FOR_NERD)
					nerd = false;
			}
			if(nerd == true)
			{
				System.out.println(student.getSurname() + " " + student.getGroupNumber());
			}
		}
	}
	
	public static void main(String[] args)
	{
		Student[] students = new Student[AMOUNT_OF_STUDENTS];
		for(int i = 0; i < AMOUNT_OF_STUDENTS; i++)
		{
			students[i] = new Student();
		}
		uberStudents(students);
	}

}
