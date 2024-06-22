package lesson7;

import static java.lang.Math.pow;

public class Circle extends Figure{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double area() {
        return pow(radius, 2) * Math.PI;
    }
}
