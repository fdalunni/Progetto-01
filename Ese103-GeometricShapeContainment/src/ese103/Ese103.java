package ese103;

import circle.*;

public class Ese103
{

	public static void main(String[] args) 
	{
		Circle c[] = new Circle[3];
		c[0] = new Circle(10, 30, 70);
		c[1] = new Circle(40, 30, 30);
		c[2] = new Circle(80, 40, 80);
		controlContainment(c[0], c[1]);
		controlContainment(c[0], c[2]);
		controlContainment(c[0], c[3]);
		controlContainment(c[1], c[0]);
		controlContainment(c[1], c[2]);
		controlContainment(c[1], c[3]);
		controlContainment(c[2], c[0]);
		controlContainment(c[2], c[1]);
		controlContainment(c[2], c[3]);
		
		System.out.println();
	}
	
	private static void controlContainment(Circle c0, Circle c1)
	{
		if(c0.contains(c1))
			System.out.println(c0 + " contiene ---> " + c1);
		else
			System.out.println(c0 + " non contiene ---> " + c1);
	}
}

