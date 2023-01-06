package coordinate;

import coordinate.exception.IsNotSquareLocationException;
import coordinate.square.SquareCoordinateCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
class SquareCoordinateCalculatorTest {

    @Test
    @DisplayName("잘못된 사각형 계산기 생성 테스트")
    void createWrongSquareCoordinateCalculatorTest() {
        CoordinateLocation firstLocation = new CoordinateLocation(10, 10);
        CoordinateLocation secondLocation = new CoordinateLocation(22, 10);
        CoordinateLocation thirdLocation = new CoordinateLocation(22, 18);
        CoordinateLocation fourthLocation = new CoordinateLocation(10, 19);
        List<CoordinateLocation> coordinateLocations = Arrays.asList(firstLocation, secondLocation, thirdLocation, fourthLocation);
        assertThrows(IsNotSquareLocationException.class, () -> {
            new SquareCoordinateCalculator(coordinateLocations);
        });
    }

    @Test
    @DisplayName("사각형 좌표 계산 테스트")
    void calcTest() {
        CoordinateLocation firstLocation = new CoordinateLocation(10, 10);
        CoordinateLocation secondLocation = new CoordinateLocation(22, 10);
        CoordinateLocation thirdLocation = new CoordinateLocation(22, 18);
        CoordinateLocation fourthLocation = new CoordinateLocation(10, 18);
        List<CoordinateLocation> coordinateLocations = Arrays.asList(firstLocation, secondLocation, thirdLocation, fourthLocation);
        SquareCoordinateCalculator calculator = new SquareCoordinateCalculator(coordinateLocations);
        assertEquals(96, calculator.calc());
    }
}
