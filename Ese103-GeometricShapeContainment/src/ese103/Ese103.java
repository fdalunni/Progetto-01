package ese103;

import circle.*;
import triangle.*;

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
		controlContainment(c[1], c[0]);
		controlContainment(c[1], c[2]);
		controlContainment(c[2], c[0]);
		controlContainment(c[2], c[1]);
		System.out.println();
		Triangle t[] = new Triangle[3];
		t[0] = new Triangle(20, 70, 80);
		t[1] = new Triangle(50, 10, 30);
		t[2] = new Triangle(20, 10, 20);
		controlContainment(t[0], t[1]);
		controlContainment(t[0], t[2]);
		controlContainment(t[1], t[0]);
		controlContainment(t[1], t[2]);
		controlContainment(t[2], t[0]);
		controlContainment(t[2], t[1]);
		System.out.println();
		controlContainment(c[0], t[0]);
		controlContainment(c[0], t[1]);
		controlContainment(c[0], t[2]);
		controlContainment(c[1], t[0]);
		controlContainment(c[1], t[1]);
		controlContainment(c[1], t[2]);
		controlContainment(c[2], t[0]);
		controlContainment(c[2], t[1]);
		controlContainment(c[2], t[2]);
		System.out.println();
	}
	
	private static void controlContainment(Circle c0, Circle c1)
	{
		if(c0.contains(c1))
			System.out.println(c0 + " contiene ---> " + c1);
		else
			System.out.println(c0 + " non contiene ---> " + c1);
	}
	private static void controlContainment(Triangle t1, Triangle t2)
	{
		if(t1.contains(t2))
			System.out.println(t1 + " contiene " + t2);
		else
			System.out.println(t1 + " non contiene " + t2);
	}
	
	
	private static void controlContainment(Circle c, Triangle t)
	{
		if(c.contains(t))
			System.out.println(c + " contiene --->" + t);
		else
			System.out.println(c + " non contiene --->" + t);
	}
	
}

