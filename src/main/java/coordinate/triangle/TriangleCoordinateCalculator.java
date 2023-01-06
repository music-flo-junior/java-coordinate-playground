package coordinate.triangle;

import coordinate.AbstractCoordinateCalculator;
import coordinate.CoordinateCalculator;
import coordinate.CoordinateLocation;
import coordinate.exception.IsNotSquareLocationException;

import java.util.Arrays;
import java.util.List;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public class TriangleCoordinateCalculator extends AbstractCoordinateCalculator {

    public static final int TRIANGLE_LOCATION_SIZE = 3;

    public TriangleCoordinateCalculator(List<CoordinateLocation> locations) {
        super(locations);
    }

    @Override
    public double calc() {
        double a = calculateLength(locations.get(0), locations.get(1));
        double b = calculateLength(locations.get(1), locations.get(2));
        double c = calculateLength(locations.get(2), locations.get(0));

        return Math.sqrt(4 * Math.pow(a, 2) * Math.pow(b, 2) - Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2), 2)) / 4;
    }

    @Override
    public int size() {
        return TRIANGLE_LOCATION_SIZE;
    }

    private double calculateLength(CoordinateLocation location1, CoordinateLocation location2) {
        return Math.sqrt(Math.pow(location1.getX() - location2.getX(), 2) +
                Math.pow(location1.getY() - location2.getY(), 2));
    }
}
