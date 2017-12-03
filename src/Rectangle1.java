public class Rectangle1 {
    private int x, y;
    private int width, height;

    public Rectangle1() {
        this(0, 0, 1, 1);
    }

    public Rectangle1(int width, int height) {
        this(0, 0, width, height);
    }

    public Rectangle1(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
