package homework1;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void printArea() {
        System.out.println("Площадь прямоугольника: "+ area());
    }
}
