package rent.domain;

public class K5 extends Car{
    private static final int distancePerLiter = 13;
    private final int tripDistance;

    public K5(int tripDistance) {
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
        return "K5";
    }
}
