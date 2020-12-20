package homework1;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printArea() {
        System.out.println("Площадь круга: "+ area());
    }
}
