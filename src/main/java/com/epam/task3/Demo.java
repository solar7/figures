package com.epam.task3;

import com.epam.task3.figures.Circle;
import com.epam.task3.figures.Rectangle;

public class Demo {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(1);
		Circle circle2 = new Circle(2);
		Circle circle3 = new Circle(3);
		Circle circle4 = new Circle(4);
		Circle circle5 = new Circle(5);
		
		Rectangle rectangle1 = new Rectangle(1, 1);
		Rectangle rectangle2 = new Rectangle(2, 2);
		Rectangle rectangle3 = new Rectangle(3, 5);
		Rectangle rectangle4 = new Rectangle(5, 3);
		Rectangle rectangle5 = new Rectangle(4, 1);
		
		Desk desk = new Desk();
		
		desk.add(circle1);
		desk.add(circle2);
		desk.add(circle3);
		desk.add(circle4);
		desk.add(circle5);
		
		desk.add(rectangle1);
		desk.add(rectangle2);
		desk.add(rectangle3);
		desk.add(rectangle4);
		desk.add(rectangle5);
		
		desk.print();
		desk.square();
		desk.perimeter();
		desk.move(100, 200);
		desk.print();
		
		System.out.println("Square total:" + desk.square());
		System.out.println("Perimeter total:" + desk.perimeter());
		
	}

}
