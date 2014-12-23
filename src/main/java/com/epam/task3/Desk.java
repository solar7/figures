package com.epam.task3;

import java.util.ArrayList;

import com.epam.task3.figures.IFigure;

public class Desk implements IDesk {
	
	private ArrayList<IFigure> container = new ArrayList<IFigure>();

	public void print() {
		for (IFigure figure:container) {
			figure.print();
		}
	}

	public void move(double x, double y) {
		for (IFigure figure:container) {
			figure.move(x, y);
		}
	}

	public double square() {
		double result = 0;
		for (IFigure figure:container) {
			result = result + figure.square();
		}
		return result;
	}

	public double perimeter() {
		double result = 0;
		for (IFigure figure:container) {
			result = result + figure.perimeter();
		}
		return result;
	}

	public void add(IDesk container) {
		this.container.add(container);
	}

	public void add(IFigure figure) {
		this.container.add(figure);
	}

}
