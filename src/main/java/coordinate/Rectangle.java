package coordinate;

public class Rectangle extends AbstractFigure {
    public static final int RECTANGLE_POINT_SIZE = 4;

    public Rectangle(Points points) {
        super(points);
    }

    @Override
    public int size() {
        return RECTANGLE_POINT_SIZE;
    }

    @Override
    public String getName() {
        return "사각형";
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void output() {
        System.out.printf("사각형 넓이는 %d", area());
    }
}
