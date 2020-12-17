package homework1;

public class MainPolymorphism {
    public static void main(String[] args) {
        //создаем массив ссылок на базовый класс
        Shape[] shapes = new Shape[5];

        //создаем объекты, ссылки на объеты храним
        //в массиве ссылок базового класса
        shapes[0]= new Circle(1);
        shapes[1]= new Rectangle(1,1);
        shapes[2]= new Trapezium(1,1,1);
        shapes[3]= new Circle(1);
        shapes[4]= new Rectangle(1,1);

        //работает механизм полимофизма
        for (int i = 0; i < shapes.length; i++)
            shapes[i].printArea();
    }
}
