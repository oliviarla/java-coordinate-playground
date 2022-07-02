package rent.domain;

public class Sonata extends Car{
    private static final int distancePerLiter = 10;
    private final int tripDistance;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return "Sonata";
    }
}
