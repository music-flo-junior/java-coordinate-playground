package coordinate.triangle;

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
public class TriangleCoordinateCalculator implements CoordinateCalculator {

    private final CoordinateLocation firstLocation;
    private final CoordinateLocation secondLocation;
    private final CoordinateLocation thirdLocation;

    public TriangleCoordinateCalculator(CoordinateLocation firstLocation,
                                        CoordinateLocation secondLocation,
                                        CoordinateLocation thirdLocation) {

        this.firstLocation = firstLocation;
        this.secondLocation = secondLocation;
        this.thirdLocation = thirdLocation;
    }

    @Override
    public double calc() {
        double a = calculateLength(firstLocation, secondLocation);
        double b = calculateLength(secondLocation, thirdLocation);
        double c = calculateLength(thirdLocation, firstLocation);

        return Math.sqrt(4 * Math.pow(a, 2) * Math.pow(b, 2) - Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2), 2)) / 4;
    }

    private double calculateLength(CoordinateLocation location1, CoordinateLocation location2) {
        return Math.sqrt(Math.pow(location1.getX() - location2.getX(), 2) +
                Math.pow(location1.getY() - location2.getY(), 2));
    }
}
