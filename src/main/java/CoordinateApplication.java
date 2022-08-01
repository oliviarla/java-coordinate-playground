import coordinate.Figure;
import coordinate.FigureFactory;
import coordinate.Points;
import view.InputView;

public class CoordinateApplication {
    private static InputView inputView;
    private static FigureFactory figureFactory = new FigureFactory();

    public static void main(String[] args) {
        inputView = new InputView();
        Points points = inputView.inputPoint();
        Figure figure = figureFactory.getInstance(points);
        figure.output();
    }
}
