package coordinate;

import coordinate.exception.OutOfRangeException;

import java.util.List;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/06
 */
public abstract class AbstractCoordinateCalculator implements CoordinateCalculator {
    protected final List<CoordinateLocation> locations;

    protected AbstractCoordinateCalculator(List<CoordinateLocation> locations) {

        if (locations.size() != size()) {
            throw new OutOfRangeException(String.format("%s는 잘못된 좌표 개수 입니다.",size()));
        }

        this.locations = locations;
    }
}
