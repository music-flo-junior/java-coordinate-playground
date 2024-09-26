package rent;

public class K5 implements CarInterface{

    private static final String name = "K5";
    private final double tripDistance;
    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }

   public double getDistancePerLiter() {
        return 13;
    }

    public double getTripDistance() {
        return this.tripDistance;
    }

    public String getName() {
        return name;
    }
}
