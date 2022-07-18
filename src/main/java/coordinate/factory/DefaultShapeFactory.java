package coordinate.factory;

import coordinate.domain.*;

public class DefaultShapeFactory implements ShapeFactory {
    public Shape create(Points points){
        int size = points.getPoints().size();
        if(size==2){
            Length length = new Length(points);
            return length;
        }
        if(size==3){
            Triangle triangle = new Triangle(points);
            return triangle;
        }
        if(size==4){
            Rectangle rectangle = new Rectangle(points);
            return rectangle;
        }
        throw new RuntimeException("주어진 점으로 shape를 만들 수 없습니다");
    }
}
