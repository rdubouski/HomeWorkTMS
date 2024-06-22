package lesson7;

import static java.lang.Math.sqrt;

public class Triangle extends Figure{

    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }
//(a * h) /2
    @Override
    double area() {
        int P = (sideA + sideB + sideC) / 2;
        return sqrt(P * (P - sideA) * (P - sideB) * (P-sideC));
    }
}
