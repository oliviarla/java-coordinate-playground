package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Points {
    protected static final List<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public List<Point> getPoints() {
        return this.points;
    }
}
