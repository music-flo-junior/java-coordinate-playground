package coordinate.util;

import java.util.Scanner;

public class InputView {

    private static final Scanner sc = new Scanner(System.in);

    public static String scanCoordinate() {
        System.out.println("좌표를 입력하세요.");
        String inputText = sc.nextLine();

        while (StringUtil.isEmpty(inputText)) {
            System.out.println("좌표를 잘못 입력하셨습니다.");
            System.out.println("다시 입력해주세요 : ");
            inputText = sc.nextLine();
        }

        return inputText;
    }
}
