package coordinate.square;

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
public class SquareCoordinateCalculator implements CoordinateCalculator {

    private final List<CoordinateLocation> locationList;
    private final double firstX;
    private final double secondX;
    private final double firstY;
    private final double secondY;

    public SquareCoordinateCalculator(CoordinateLocation firstLocation,
                                      CoordinateLocation secondLocation,
                                      CoordinateLocation thirdLocation,
                                      CoordinateLocation fourthLocation) {

        this.locationList = Arrays.asList(firstLocation, secondLocation, thirdLocation, fourthLocation);

        this.firstX = locationList.stream().map(CoordinateLocation::getX).findFirst().orElseThrow(IsNotSquareLocationException::new);
        this.secondX = locationList.stream().map(CoordinateLocation::getX).filter(x -> x != firstX).findFirst().orElseThrow(IsNotSquareLocationException::new);
        this.firstY = locationList.stream().map(CoordinateLocation::getY).findFirst().orElseThrow(IsNotSquareLocationException::new);
        this.secondY = locationList.stream().map(CoordinateLocation::getY).filter(y -> y != firstX).findFirst().orElseThrow(IsNotSquareLocationException::new);

        isValidLocation();
    }

    @Override
    public double calc() {
        return Math.abs(firstX - secondX) * Math.abs(firstY - secondY);
    }

    public void isValidLocation() {
        if (locationList.stream().filter(location -> location.getX() == firstX).count() != 2 ||
                locationList.stream().filter(location -> location.getX() == secondX).count() != 2) {
            throw new IsNotSquareLocationException();
        }

        if (locationList.stream().filter(location -> location.getY() == firstY).count() != 2 ||
                locationList.stream().filter(location -> location.getY() == secondY).count() != 2) {
            throw new IsNotSquareLocationException();
        }

    }
}
