package coordinate.Figure;

import java.util.List;

public class FigureFactory {
    public static Figure getFigure(List<Point> pointList) {
        switch (pointList.size()) {
            case 2:
                return new Line(pointList);
            case 3:
                return new Triangle(pointList);
            case 4:
                return new Rectangle(pointList);
            default:
                throw new RuntimeException("유효하지 않은 도형입니다.");
        }
    }

    public static void printArea(Figure figure) {
        System.out.println(figure.getName() + ": " + String.format("%.2f", figure.getArea()));
    }
}
