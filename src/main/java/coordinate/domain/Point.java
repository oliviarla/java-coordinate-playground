package coordinate.domain;

public class Point {
    private final int x;
    private final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        validate(x);
        validate(y);
        this.x=x;
        this.y=y;
    }

    public void validate(int i) {
        if(i>24){
            throw new IllegalArgumentException("입력 좌표는 24를 초과할 수 없습니다");
        }
        if(i<0){
            throw new IllegalArgumentException("입력 좌표는 음수일 수 없습니다.");
        }
    }
}
