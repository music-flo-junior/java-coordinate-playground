package coordinate.util;

import coordinate.figure.Point;

public class PointUtil {
    public static double calculateBetweenDistance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }
}