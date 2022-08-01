package coordinate;

public abstract class AbstractFigure implements Figure {
    protected final Points points;

    public AbstractFigure(Points points) {
        if (points.size() != size()) {
            throw new IllegalArgumentException(getName() + "의 길이는 " + size() + "이어야 합니다.");
        }

        this.points = points;
    }

//    protected Point getPoint(int index) {
//        return points.getPoints().get(index);
//    }

    @Override
    public Points getPoints() {
        return points;
    }
}
