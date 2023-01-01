package coordinate.square;

import coordinate.CoordinatePrinter;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public class SquareCoordinatePrinter extends CoordinatePrinter {

    public SquareCoordinatePrinter(double result) {
        super(result);
    }

    @Override
    public void print() {
        System.out.printf("사각형 넓이는 %.0f", result);
    }
}
