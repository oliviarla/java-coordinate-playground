package coordinate.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ViewTest {
    OutputView outputView;
    @BeforeEach
    void setUp(){
        outputView = new OutputView();
    }

    @Test
    void coordTest(){
        outputView.outputCoord();
    }
}
