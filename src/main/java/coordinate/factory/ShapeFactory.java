package coordinate.factory;

import coordinate.domain.Points;
import coordinate.domain.Shape;

public interface ShapeFactory {
    abstract Shape create(Points points);
}
