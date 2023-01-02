package coordinate;

import coordinate.Figure.Figure;
import coordinate.Figure.FigureFactory;
import coordinate.Figure.Point;
import coordinate.util.InputView;
import coordinate.util.StringUtil;

import java.util.List;

public class CoordinateCalculator {

    public static void main(String[] args) {
        String inputCoordinate = InputView.scanCoordinate();
        List<Point> pointList = StringUtil.convertToPoints(inputCoordinate);
        Figure figure = FigureFactory.getFigure(pointList);
        FigureFactory.printArea(figure);
    }
}
