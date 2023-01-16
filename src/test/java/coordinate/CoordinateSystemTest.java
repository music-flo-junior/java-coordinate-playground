package coordinate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CoordinateSystemTest {
    @Test
    @DisplayName("선의 길이가 정상적으로 나오는지 확인한다.")
    void lineTest() {
        Line line = new Line(Arrays.asList(new Position(10, 10), new Position(14, 15)));
        Assertions.assertThat(line.getResult()).isEqualTo("두 점 사이 거리는 6.403124\n");
    }

    @Test
    @DisplayName("사각형의 넓이가 정상적으로 나오는지 확인한다.")
    void squareTest() {
        Square square = new Square(Arrays.asList(
                new Position(10, 10), new Position(22, 10),
                new Position(22, 18), new Position(10, 18)
        ));
        Assertions.assertThat(square.getResult()).isEqualTo("사각형 넓이는 96\n");
    }

    @Test
    @DisplayName("직사각형이 아닌 경우")
    void notRectangleTest() {
        assertThatThrownBy(() -> {
            new Square(Arrays.asList(
                    new Position(10, 11), new Position(22, 10),
                    new Position(22, 18), new Position(10, 18)
            ));
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("직사각형만 가능합니다.");
    }

    @Test
    @DisplayName("삼각형의 넓이가 정상적으로 나오는지 확인한다.")
    void triangleTest() {
        Triangle triangle = new Triangle(Arrays.asList(
                new Position(10, 10), new Position(14, 15),
                new Position(20, 8)
        ));
        Assertions.assertThat(triangle.getResult()).isEqualTo("삼각형 넓이는 29.0\n");
    }


    @Test
    @DisplayName("도형 팩토리의 결과가 잘 나오는지 확인한다. (선)")
    void shapeFactoryTest1() {
        List<Position> positionList = Arrays.asList(new Position(10, 10), new Position(14, 15));
        Shape shape = new ShapeFactory().create(positionList);
        Assertions.assertThat(shape.getMame()).isEqualTo("선");
    }


    @Test
    @DisplayName("도형 팩토리의 결과가 잘 나오는지 확인한다. (사각형)")
    void shapeFactoryTest2() {
        List<Position> positionList = Arrays.asList(
                new Position(10, 10), new Position(20, 10),
                new Position(22, 18), new Position(10, 18));
        Shape shape = new ShapeFactory().create(positionList);
        Assertions.assertThat(shape.getMame()).isEqualTo("사각형");
    }

    @Test
    @DisplayName("도형 팩토리의 결과가 잘 나오는지 확인한다. (삼각형)")
    void shapeFactoryTest3() {
        List<Position> positionList = Arrays.asList(
                new Position(10, 10), new Position(14, 15),
                new Position(20, 8));
        Shape shape = new ShapeFactory().create(positionList);
        Assertions.assertThat(shape.getMame()).isEqualTo("삼각형");
    }

    @Test
    @DisplayName("포지션 변환기가 정상적으로 작동하는지 테스트한다.")
    void positionConvertTest() {
        List<Position> positionList = PositionConvertor.convertToPositionList("(10,10)-(14,15)\n");
        Assertions.assertThat(positionList).hasSize(2);
        Assertions.assertThat(positionList.get(0)).isEqualTo(new Position(10, 10));
        Assertions.assertThat(positionList.get(1)).isEqualTo(new Position(14, 15));
    }

}
