package coordinate.Figure;

import coordinate.util.PointUtil;

import java.util.List;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    String getName() {
        return "사각형";
    }

    @Override
    double getArea() {
        return this.area;
    }

    @Override
    double calculateArea(List<Point> points) {
        this.width = PointUtil.calculateBetweenDistance(points.get(0), points.get(1));
        this.height = PointUtil.calculateBetweenDistance(points.get(0), points.get(3));
        if (isRectangle(points)) {
            return this.width * this.height;
        }
        throw new RuntimeException("직사각형 좌표를 잘못 입력하셨습니다.");
    }

    private boolean isRectangle(List<Point> points) {
        if (this.width > 0 && this.height > 0) {
            double anotherWidth = PointUtil.calculateBetweenDistance(points.get(3), points.get(2));
            double anotherHeight = PointUtil.calculateBetweenDistance(points.get(3), points.get(0));
            // 직사각형 인지 체크하기 위해, 마지막 좌표 기준의 세로,가로 길이가 동일한지 체크
            return anotherWidth == this.width && anotherHeight == this.height;
        }
        return false;
    }
}
