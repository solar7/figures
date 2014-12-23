package com.epam.task3.figures;


public abstract class AbstractFigure implements IFigure {
	
	private double x;
	
	private double y;
	
	public abstract String getParameters();

	public void print() {
		System.out.println(
				"Figure: " + getClass().getSimpleName() + "(" + x + "," + y + ")" +
				"\n\tParameters: " + getParameters() +
				"\n\tSquare: " + square() +
				"\n\tPerimeter: " + perimeter());
	}

	public void move(double x, double y) {
		this.x = x;
		this.y = y;
	}

}
