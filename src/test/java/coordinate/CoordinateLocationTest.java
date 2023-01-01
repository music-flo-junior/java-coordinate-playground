package coordinate;

import coordinate.exception.OutOfRangeException;
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
class CoordinateLocationTest {


    @Test
    @DisplayName("좌표 생성 테스트")
    void createCoordinationLocationTest() {

        CoordinateLocation location = new CoordinateLocation(10, 20);

        assertEquals(10, location.getX());
        assertEquals(20, location.getY());
    }

    @Test
    @DisplayName("잘못된 좌표 생성 테스트")
    void createWrongCoordinationLocationTest() {
        assertThrows(OutOfRangeException.class, () -> {
            new CoordinateLocation(25, 20);
        });

        assertThrows(OutOfRangeException.class, () -> {
            new CoordinateLocation(20, 25);
        });
    }

    @Test
    @DisplayName("같은 좌표 비교 테스트")
    void equalsCoordinateLocationTest() {
        CoordinateLocation locationOne = new CoordinateLocation(10, 20);
        CoordinateLocation locationTwo = new CoordinateLocation(10, 20);

        assertEquals(locationOne, locationTwo);
    }
}
