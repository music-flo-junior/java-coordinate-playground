package coordinate.figure;

import java.util.List;

public abstract class Figure {
    double area;

    public Figure(List<Point> points) {
        this.area = calculateArea(points);
    }

    /**
     * 도형 이름
     */
    public abstract String getName();

    /**
     * 면적
     */
    public abstract double getArea();

    /**
     * 면적 계산
     */
    abstract double calculateArea(List<Point> points);
}
