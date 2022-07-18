package coordinate.domain;


public abstract class Shape {
    final Points points;

    public Shape(Points points) {
        if(points.getPoints().size()<2 || points.getPoints().size()>4){
            throw new IllegalArgumentException("2개 이상 4개 이하 point만 입력되어야 합니다.");
        }
        this.points = points;
    }

    public abstract Object calc();
    public abstract void output();
}
