package coordinate;

import coordinate.line.LineCoordinateCalculator;
import coordinate.triangle.TriangleCoordinateCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
class TriangleCoordinateCalculatorTest {

    @Test
    @DisplayName("선 길이 계산 테스트")
    void calcTest() {
        CoordinateLocation firstLocation = new CoordinateLocation(10, 10);
        CoordinateLocation secondLocation = new CoordinateLocation(14, 15);
        CoordinateLocation thirdLocation = new CoordinateLocation(20, 8);
        List<CoordinateLocation> coordinateLocations = Arrays.asList(firstLocation, secondLocation, thirdLocation);
        CoordinateCalculator lineCoordinate = new TriangleCoordinateCalculator(coordinateLocations);
        assertEquals(29.0, lineCoordinate.calc());
    }
}
