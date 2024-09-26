package coordinate.figure;

import coordinate.model.type.FigureType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory implements FigureCreator {
    private static final Map<FigureType, Function<List<Point>, Figure>> figureMap = new HashMap<>();

    public FigureFactory() {
        figureMap.put(FigureType.LINE, Line::new);
        figureMap.put(FigureType.TRIANGLE, Triangle::new);
        figureMap.put(FigureType.RECTANGLE, Rectangle::new);
    }

    public Figure getInstance(List<Point> pointList) {
        return create(pointList);
    }

    public void printArea(Figure figure) {
        System.out.println(figure.getName() + ": " + String.format("%.2f", figure.getArea()));
    }

    @Override
    public Figure create(List<Point> points) {
        FigureType figureType = FigureType.getByPointListSize(points.size());

        if (figureType == null) {
            throw new RuntimeException("유효하지 않은 도형입니다.");
        }

        return figureMap.get(figureType).apply(points);
    }
}