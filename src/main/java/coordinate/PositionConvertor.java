package coordinate;

import java.util.ArrayList;
import java.util.List;

public class PositionConvertor {

    private PositionConvertor() {
    }

    public static List<Position> convertToPositionList(String input) {
        String[] positions = input.split("-");
        List<Position> positionList = new ArrayList<>();
        for (String position : positions) {
            positionList.add(convertToPosition(position));
        }
        return positionList;
    }

    private static Position convertToPosition(String input) {
        String[] position = input.split(",");
        int x = Integer.parseInt(position[0].split("\\(")[1]);
        int y = Integer.parseInt(position[1].split("\\)")[0]);
        return new Position(x, y);
    }
}
