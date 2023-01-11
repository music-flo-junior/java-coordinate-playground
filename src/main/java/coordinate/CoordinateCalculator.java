package coordinate;

import coordinate.figure.Figure;
import coordinate.figure.FigureFactory;
import coordinate.figure.Point;
import coordinate.util.InputView;
import coordinate.util.StringUtil;

import java.util.List;

public class CoordinateCalculator {
    public static void main(String[] args) {
        String inputCoordinate = InputView.scanCoordinate();
        List<Point> pointList = StringUtil.convertToPoints(inputCoordinate);
        FigureFactory figureFactory = new FigureFactory();
        Figure figure = figureFactory.getInstance(pointList);
        figureFactory.printArea(figure);
    }
}