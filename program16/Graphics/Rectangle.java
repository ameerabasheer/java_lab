package Graphics;

public class Rectangle implements GraphicsRe {
    int length, breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public double area() {
        return length * breadth;
    }
}
