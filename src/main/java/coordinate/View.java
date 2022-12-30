package coordinate;

import java.util.List;
import java.util.Scanner;

public class View {
    public static List<Position> input() {
        System.out.println("좌표를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        return PositionConvertor.convertToPositionList(scanner.nextLine());
    }

    public static void result(Shape shape) {
        System.out.println(shape.getResult());
    }

}
