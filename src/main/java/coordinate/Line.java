package coordinate;

import java.util.List;

public class Line implements Shape {

    private final List<Position> positionList;

    public Line(List<Position> positionList) {
        if (positionList == null || positionList.size() != 2) {
            throw new IllegalArgumentException("선은 좌표가 2개 필요합니다.");
        }
        this.positionList = positionList;
    }

    /**
     * 두 점 사이의 거리: 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
     */
    public double calculate() {
        return Math.sqrt(
                Math.pow(positionList.get(0).getX() - positionList.get(1).getX(), 2) +
                        Math.pow(positionList.get(0).getY() - positionList.get(1).getY(), 2));
    }

    @Override
    public String getMame() {
        return "선";
    }

    @Override
    public String getResult() {
        return String.format("두 점 사이 거리는 %f\n", calculate());
    }

}
