package coordinate;

import coordinate.line.LineCoordinateCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
class LineCoordinateCalculatorTest {

    @Test
    @DisplayName("선 길이 계산 테스트")
    void calcTest() {
        CoordinateLocation firstLocation = new CoordinateLocation(10, 10);
        CoordinateLocation secondLocation = new CoordinateLocation(14, 15);
        CoordinateCalculator lineCoordinate = new LineCoordinateCalculator(firstLocation, secondLocation);
        assertEquals(6.403124, lineCoordinate.calc(), 0.001);
    }
}
