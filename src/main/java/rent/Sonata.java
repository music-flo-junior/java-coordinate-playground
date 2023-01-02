package rent;

public class Sonata implements CarInterface {

    private static final String name = "Sonata";
    private final double tripDistance;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    public double getDistancePerLiter() {
        return 10;
    }

    public double getTripDistance() {
        return this.tripDistance;
    }

    public String getName() {
        return name;
    }
}
