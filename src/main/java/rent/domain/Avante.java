package rent.domain;

public class Avante extends Car{
    private static final int distancePerLiter = 15;
    private final int tripDistance;

    public Avante(int tripDistance) {
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
        return "Avante";
    }
}
