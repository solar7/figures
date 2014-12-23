package com.epam.task3.figures;


public class Rectangle extends AbstractFigure {
	
	private double a;
	
	private double b;
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double square() {
		return a*b;
	}

	public double perimeter() {
		return 2*(a + b);
	}

	public String getParameters() {
		return "a=" + a + ", b=" + b;
	}

}
