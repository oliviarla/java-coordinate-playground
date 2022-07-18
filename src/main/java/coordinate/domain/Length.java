package coordinate.domain;

public class Length extends Shape {
    private final float length;

    public Length(Points points) {
        super(points);
        this.length = calc();
    }

    @Override
    public Float calc(){
        Point p1 = this.points.getPoints().get(0);
        Point p2 = this.points.getPoints().get(1);

        return makeLine(p1, p2);
    }

    public float makeLine(Point p1, Point p2){
        int difX = Math.abs(p1.getX()-p2.getX());
        int difY = Math.abs(p1.getY()-p2.getY());
        double powX = Math.pow(difX, 2);
        double powY = Math.pow(difY, 2);

        return (float)Math.sqrt(powX+powY);
    }

    public float getLength() {
        return length;
    }

    @Override
    public void output() {
        System.out.printf("두 점 사이 거리는 %f \n",this.getLength());
    }
}
