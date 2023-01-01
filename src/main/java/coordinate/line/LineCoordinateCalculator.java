package coordinate.line;

import coordinate.CoordinateCalculator;
import coordinate.CoordinateLocation;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public class LineCoordinateCalculator implements CoordinateCalculator {

    private final CoordinateLocation firstLocation;
    private final CoordinateLocation secondLocation;

    public LineCoordinateCalculator(CoordinateLocation firstLocation, CoordinateLocation secondLocation) {
        this.firstLocation = firstLocation;
        this.secondLocation = secondLocation;
    }

    @Override
    public double calc() {
        double first = pow(firstLocation.getX(), secondLocation.getX());
        double two = pow(firstLocation.getY(), secondLocation.getY());
        return Math.sqrt(first + two);
    }

    private double pow(double first, double second) {
        return Math.pow(first - second, 2);
    }

}
