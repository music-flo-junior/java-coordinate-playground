package coordinate.line;

import coordinate.CoordinatePrinter;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public class LineCoordinatePrinter extends CoordinatePrinter {

    public LineCoordinatePrinter(double result) {
        super(result);
    }

    @Override
    public void print() {
        System.out.printf("두 점 사이 거리는 %f", result);
    }
}
