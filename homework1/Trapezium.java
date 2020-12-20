package homework1;

public class Trapezium extends Shape {
    private int length;
    private int width;
    private int height;

    public Trapezium(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return (length + width) * height / 2;
    }

    @Override
    public void printArea() {
        System.out.println("Площадь трапеции: "+ area());
    }
}
