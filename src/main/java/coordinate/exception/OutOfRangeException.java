package coordinate.exception;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public class OutOfRangeException extends RuntimeException{

    public OutOfRangeException(String message) {
        super(message);
    }
}
