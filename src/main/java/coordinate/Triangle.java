package coordinate;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends AbstractFigure {
    public static final int TRIANGLE_POINT_SIZE = 3;

    public Triangle(Points points) {
        super(points);
    }

    @Override
    public int size() {
        return TRIANGLE_POINT_SIZE;
    }

    @Override
    public String getName() {
        return "삼각형";
    }

    @Override
    public double area() {
        List<Double> distances = new ArrayList<>();
        distances.add(points.get(0).getDistance(points.get(1)));
        distances.add(points.get(1).getDistance(points.get(2)));
        distances.add(points.get(2).getDistance(points.get(0)));
        Double s = distances.stream().mapToDouble(i->i).sum() /2;
        Double result = s;
        for(Double d: distances){
            result *= (s-d);
        }

        return Math.sqrt(result);
    }

    @Override
    public void output() {
        System.out.printf("삼각형 넓이는 %f", area());
    }
}
