package coordinate.figure;

import coordinate.model.type.FigureType;
import coordinate.util.PointUtil;

import java.util.List;

public class Line extends Figure {
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public String getName() {
        return FigureType.LINE.getName();
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    double calculateArea(List<Point> points) {
        return PointUtil.calculateBetweenDistance(points.get(0), points.get(1));
    }
}
