package coordinate;

import java.util.List;

public class Triangle implements Shape {

    private final List<Position> positionList;

    public Triangle(List<Position> positionList) {
        if (positionList == null || positionList.size() != 3) {
            throw new IllegalArgumentException("삼각형은 좌표가 3개 필요합니다.");
        }
        this.positionList = positionList;
    }


    @Override
    public String getMame() {
        return "삼각형";
    }

    @Override
    public String getResult() {
        return String.format("삼각형 넓이는 %.1f\n", calculate());
    }

    @Override
    public double calculate() {
        double a = calculateLength(positionList.get(0), positionList.get(1));
        double b = calculateLength(positionList.get(1), positionList.get(2));
        double c = calculateLength(positionList.get(2), positionList.get(0));

        return Math.sqrt(4 * Math.pow(a, 2) * Math.pow(b, 2) - Math.pow(Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2), 2)) / 4;
    }

    private double calculateLength(Position position1, Position position2) {
        return Math.sqrt(Math.pow(position1.getX() - position2.getX(), 2) +
                Math.pow(position1.getY() - position2.getY(), 2));
    }
}
