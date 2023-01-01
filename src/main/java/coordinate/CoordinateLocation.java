package coordinate;

import coordinate.exception.OutOfRangeException;

import java.util.Objects;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public class CoordinateLocation {

    private final double x;

    private final double y;

    private static final int LIMIT = 24;

    public CoordinateLocation(int x, int y) {

        if (x > LIMIT || y > LIMIT) {
            throw new OutOfRangeException(String.format("최대 %d 까지만 입력 할 수 있습니다",LIMIT));
        }

        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoordinateLocation that = (CoordinateLocation) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
