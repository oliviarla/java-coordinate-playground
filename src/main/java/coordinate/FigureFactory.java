package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureFactory {
    public static final Map<Integer, FigureCreator> FIGURE_MAP = new HashMap<>();

    static{
        FIGURE_MAP.put(Line.LINE_POINT_SIZE, Line::new);
        FIGURE_MAP.put(Triangle.TRIANGLE_POINT_SIZE, Triangle::new);
        FIGURE_MAP.put(Rectangle.RECTANGLE_POINT_SIZE, Rectangle::new);
    }

    static Figure getInstance(List<Point> points) {
        Figure figure;
        try{
            figure = FIGURE_MAP.get(points.size()).create(points);
        } catch (NullPointerException e){
            throw new IllegalArgumentException("점의 개수는 2~4개여야 합니다.");
        }
        return figure;
    }
}
