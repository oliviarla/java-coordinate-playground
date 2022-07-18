package coordinate;

import coordinate.domain.Points;
import coordinate.domain.Shape;
import coordinate.factory.DefaultShapeFactory;
import coordinate.factory.ShapeFactory;
import coordinate.view.InputView;

public class CoordinateApplication {
    private static InputView inputView;
    private static ShapeFactory shapeFactory = new DefaultShapeFactory();

    public static void main(String[] args) {
        inputView = new InputView();
        Points points = inputView.inputPoint();
        Shape shape = shapeFactory.create(points);
        shape.output();
    }
}
