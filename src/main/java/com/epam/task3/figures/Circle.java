package com.epam.task3.figures;


public class Circle extends AbstractFigure {
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double square() {
		return Math.PI*Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2*Math.PI*radius;
	}

	public String getParameters() {
		return "radius=" + radius;
	}
	
}
