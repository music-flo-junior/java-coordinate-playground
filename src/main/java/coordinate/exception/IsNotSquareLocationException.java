package coordinate.exception;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2023/01/01
 */
public class IsNotSquareLocationException extends RuntimeException{

    public IsNotSquareLocationException() {
        super("올바른 사각형 좌표가 아닙니다.");
    }
}
