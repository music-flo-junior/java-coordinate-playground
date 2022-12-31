package fuelinjection.car;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/12/31
 */
public interface InterfaceCar {

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    double getTripDistance();

    /**
     * 차종의 이름
     */
    String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    default double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
