package coordinate;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public abstract class CoordinatePrinter {

    protected double result;

    public abstract void print();

    protected CoordinatePrinter(double result) {
        this.result = result;
    }
}
