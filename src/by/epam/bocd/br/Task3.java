package by.epam.bocd.br;

import java.util.Scanner;

public class Task3
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		
		// координаты направляющих векторов
		double vx1 = x2 - x1;
		double vx2 = x3 - x1;
		double vy1 = y2 - y1;
		double vy2 = y3 - y1;
		
		// проверка на линейную зависимость координат
		if(vx1/vx2 == vy1/vy2)
		{
			System.out.println("Все точки на одной прямой");
		}
		else
		{
			System.out.println("Точки располагаются на разных прямых");
		}
	}

}
