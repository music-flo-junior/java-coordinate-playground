package coordinate;

import java.util.List;

public class ShapeFactory {

    Shape create(List<Position> positions) {
        if (positions == null) {
            throw new IllegalArgumentException("좌표를 입력해주세요.");
        }
        if (positions.size() == 2) {
            return new Line(positions);
        } else if (positions.size() == 3) {
            return new Triangle(positions);
        } else if (positions.size() == 4) {
            return new Square(positions);
        }

        throw new IllegalArgumentException("결과를 구할 수 없는 도형입니다.");
    }
}
