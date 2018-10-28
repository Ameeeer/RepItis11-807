package Java.cars;

public class Triangle extends Shape {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double perimeter() {
        return 0;
    }

    @Override
    double area() {
        return 0;
    }
}
