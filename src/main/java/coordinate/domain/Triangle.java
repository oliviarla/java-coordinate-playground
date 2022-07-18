package coordinate.domain;

public class Triangle extends Shape{
    private final float area;

    public Triangle(Points points) {
        super(points);
        this.area = calc();
    }

    @Override
    public Float calc() {
        return Float.valueOf(3);
    }

    public float getArea() {
        return area;
    }

    @Override
    public void output() {
        System.out.println("삼각형 넓이는 "+this.getArea());
    }
}
