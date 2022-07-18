package coordinate.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {
    public Point point;
    @BeforeEach
    void setUp(){
        point = new Point(1, 1);
    }

    @Test
    @DisplayName("24 초과 시 Exception 발생 테스트")
    void validationTest1(){
        assertThatThrownBy(() -> point.validate(25)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("음수 입력 시 Exception 발생 테스트")
    void validationTest2(){
        assertThatThrownBy(() -> point.validate(-1)).isInstanceOf(IllegalArgumentException.class);
    }

}
