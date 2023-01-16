package coordinate;

import java.util.Objects;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        if (x < 0 || x > 24) {
            throw new IllegalArgumentException("x 좌표의 범위는 0부터 24까지 입니다.");
        }
        if (y < 0 || y > 24) {
            throw new IllegalArgumentException("y 좌표의 범위는 0부터 24까지 입니다.");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
