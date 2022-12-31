package fuelinjection.car;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/12/31
 */
public abstract class AbstractCar {

    protected double tripDistance;

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    public abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    public abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    public abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
