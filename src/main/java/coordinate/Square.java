package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        if (!isRectangle(positionList)) {
            throw new IllegalArgumentException("직사각형만 가능합니다.");
        }
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

    private boolean isRectangle(List<Position> positionList) {
        Map<Integer, Integer> positionXCountMap = new HashMap<>();
        Map<Integer, Integer> positionYCountMap = new HashMap<>();
        for (Position position : positionList) {
            positionXCountMap.put(position.getX(), positionXCountMap.getOrDefault(position.getX(), 0) + 1);
            positionYCountMap.put(position.getY(), positionYCountMap.getOrDefault(position.getY(), 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : positionXCountMap.entrySet()) {
            if (entry.getValue() != 2) {
                return false;
            }
        }
        for (Map.Entry<Integer, Integer> entry : positionYCountMap.entrySet()) {
            if (entry.getValue() != 2) {
                return false;
            }
        }
        return true;
    }
}
