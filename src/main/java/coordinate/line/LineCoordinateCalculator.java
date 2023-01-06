package coordinate.line;

import coordinate.AbstractCoordinateCalculator;
import coordinate.CoordinateLocation;

import java.util.List;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public class LineCoordinateCalculator extends AbstractCoordinateCalculator {

    public static final int LINE_LOCATION_SIZE = 2;

    public LineCoordinateCalculator(List<CoordinateLocation> locations) {
        super(locations);
    }

    @Override
    public int size() {
        return LINE_LOCATION_SIZE;
    }

    @Override
    public double calc() {
        double first = pow(locations.get(0).getX(), locations.get(1).getX());
        double two = pow(locations.get(0).getY(), locations.get(1).getY());
        return Math.sqrt(first + two);
    }

    private double pow(double first, double second) {
        return Math.pow(first - second, 2);
    }

}
