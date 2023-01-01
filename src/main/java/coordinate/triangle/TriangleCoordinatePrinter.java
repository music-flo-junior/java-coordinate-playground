package coordinate.triangle;

import coordinate.CoordinatePrinter;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public class TriangleCoordinatePrinter extends CoordinatePrinter {

    public TriangleCoordinatePrinter(double result) {
        super(result);
    }

    @Override
    public void print() {
        System.out.printf("삼각형 넓이는 %.1f", result);
    }
}
