package coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rectangle extends Shape {
    private final int area;

    public Rectangle(Points points) {
        super(points);
        this.area = calc();
    }

    @Override
    public Integer calc() {
        Set<Integer> lines = new HashSet<>();
        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                if(lines.size()<2){
                    lines.add((int)makeLine(this.points.getPoints().get(i), this.points.getPoints().get(j)));
                }
            }
            if(lines.size()==2){
                break;
            }
        }
        int result = 1;
        for(int l: lines){
            result *= l;
            System.out.println(l);
        }
        return result;
    }

    static float makeLine(Point p1, Point p2) {
        int difX = Math.abs(p1.getX()-p2.getX());
        int difY = Math.abs(p1.getY()-p2.getY());
        double powX = Math.pow(difX, 2);
        double powY = Math.pow(difY, 2);

        return (float)Math.sqrt(powX+powY);
    }

    private int getArea() {
        return this.area;
    }

    @Override
    public void output() {
        System.out.println("사각형 넓이는 "+this.getArea());
    }
}
