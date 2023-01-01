package coordinate;

import coordinate.exception.IsNotSquareLocationException;
import coordinate.square.SquareCoordinateCalculator;
import coordinate.square.SquareCoordinatePrinter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        assertThrows(IsNotSquareLocationException.class, () -> {
            new SquareCoordinateCalculator(firstLocation, secondLocation, thirdLocation, fourthLocation);
        });
    }

    @Test
    @DisplayName("사각형 좌표 계산 테스트")
    void calcTest() {
        CoordinateLocation firstLocation = new CoordinateLocation(10, 10);
        CoordinateLocation secondLocation = new CoordinateLocation(22, 10);
        CoordinateLocation thirdLocation = new CoordinateLocation(22, 18);
        CoordinateLocation fourthLocation = new CoordinateLocation(10, 18);
        SquareCoordinateCalculator calculator =new SquareCoordinateCalculator(firstLocation, secondLocation, thirdLocation, fourthLocation);
        assertEquals(96,  calculator.calc());
    }
}
