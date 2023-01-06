package coordinate.square;

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
public class SquareCoordinateCalculator extends AbstractCoordinateCalculator {

    public static final int SQUARE_LOCATION_SIZE = 4;
    private final double firstX;
    private final double secondX;
    private final double firstY;
    private final double secondY;

    public SquareCoordinateCalculator(List<CoordinateLocation> locations) {
        super(locations);
        this.firstX = locations.stream().map(CoordinateLocation::getX).findFirst().orElseThrow(IsNotSquareLocationException::new);
        this.secondX = locations.stream().map(CoordinateLocation::getX).filter(x -> x != firstX).findFirst().orElseThrow(IsNotSquareLocationException::new);
        this.firstY = locations.stream().map(CoordinateLocation::getY).findFirst().orElseThrow(IsNotSquareLocationException::new);
        this.secondY = locations.stream().map(CoordinateLocation::getY).filter(y -> y != firstX).findFirst().orElseThrow(IsNotSquareLocationException::new);
        isValidLocation();
    }

    @Override
    public double calc() {
        return Math.abs(firstX - secondX) * Math.abs(firstY - secondY);
    }

    @Override
    public int size() {
        return SQUARE_LOCATION_SIZE;
    }

    public void isValidLocation() {
        if (locations.stream().filter(location -> location.getX() == firstX).count() != 2 ||
                locations.stream().filter(location -> location.getX() == secondX).count() != 2) {
            throw new IsNotSquareLocationException();
        }

        if (locations.stream().filter(location -> location.getY() == firstY).count() != 2 ||
                locations.stream().filter(location -> location.getY() == secondY).count() != 2) {
            throw new IsNotSquareLocationException();
        }
    }
}
