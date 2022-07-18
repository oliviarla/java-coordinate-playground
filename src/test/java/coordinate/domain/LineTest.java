package coordinate.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {
    Point p1;
    Point p2;
    Points points;
    @BeforeEach
    void setUp(){
        p1 = new Point(10, 10);
        p2 = new Point(14, 15);

        points.addPoint(p1);
        points.addPoint(p2);
    }

    @Test
    void lengthTest(){
        Length length = new Length(points);
        assertEquals(length.getLength(), 6.403, 0.001);
    }
}
