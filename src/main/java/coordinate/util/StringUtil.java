package coordinate.util;

import coordinate.Figure.Point;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
    public static String[] splitToArray(String inputText, String splitStr) {
        return inputText.split(splitStr);
    }

    public static boolean isEmpty(String inputText) {
        return inputText == null || inputText.isEmpty();
    }

    public static int getOnlyNumber(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    }

    public static List<Point> convertToPoints(String inputCoordinate) {
        String[] inputCoordinateArr = splitToArray(inputCoordinate, "-");
        List<Point> points = new ArrayList<>();
        for (String coordinate : inputCoordinateArr) {
            String[] point = splitToArray(coordinate, ",");
            points.add(new Point(getOnlyNumber(point[0]), getOnlyNumber(point[1])));
        }
        return points;
    }

}
