package com.epam.task3;

import com.epam.task3.figures.IFigure;

public interface IDesk extends IFigure {

	void add(IDesk container);

	void add(IFigure figure);

}
