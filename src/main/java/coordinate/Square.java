package coordinate;

import java.util.List;

public class Square implements Shape {

    private final List<Position> positionList;

    public Square(List<Position> positionList) {
        validation(positionList);
        this.positionList = positionList;
    }

    private void validation(List<Position> positionList) {
        if (positionList == null || positionList.size() != 4) {
            throw new IllegalArgumentException("사각형은 좌표가 4개 필요합니다.");
        }
        // TODO: 네 점이 뒤틀어진 사다리꼴이나 마름모는 제외하고 직사각형만 허용하도록 검사한다.
    }

    @Override
    public String getMame() {
        return "사각형";
    }

    @Override
    public String getResult() {
        return String.format("사각형 넓이는 %.0f\n", calculate());
    }

    /**
     * width * height
     */
    @Override
    public double calculate() {
        int x = positionList.get(0).getX();
        int y = positionList.get(0).getY();
        int width = 0;
        int height = 0;
        for (Position position : positionList) {
            if (position.getX() > x) {
                width = position.getX() - x;
            }
            if (position.getY() > y) {
                height = position.getY() - y;
            }
        }
        return width * height;
    }

}
