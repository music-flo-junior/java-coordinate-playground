package coordinate.Figure;

import coordinate.util.PointUtil;

import java.util.List;

public class Triangle extends Figure {

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    String getName() {
        return "삼각형";
    }

    @Override
    double getArea() {
        return this.area;
    }

    @Override
    double calculateArea(List<Point> points) {
        double hypotenuse01 = PointUtil.calculateBetweenDistance(points.get(0), points.get(1));
        double hypotenuse02 = PointUtil.calculateBetweenDistance(points.get(1), points.get(2));
        double hypotenuse03 = PointUtil.calculateBetweenDistance(points.get(2), points.get(0));
        double s = (hypotenuse01 + hypotenuse02 + hypotenuse03) / 2.0;
        return Math.sqrt(s * (s - hypotenuse01) * (s - hypotenuse02) * (s - hypotenuse03));
    }
}
