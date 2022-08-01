package coordinate;

import java.util.ArrayList;
import java.util.List;

public class Points {
    protected static final List<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public Point get(int index) {
        return points.get(index);
    }

    public static List<Point> getPoints() {
        return points;
    }

    public int size(){
        return this.points.size();
    }
}
