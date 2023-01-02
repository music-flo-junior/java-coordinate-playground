package rent;

public class Avante implements CarInterface {

    private static final String name = "Avante";
    private final double tripDistance;

    public Avante(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    public double getDistancePerLiter() {
        return 15;
    }

    public double getTripDistance() {
        return this.tripDistance;
    }

    public String getName() {
        return name;
    }
}
