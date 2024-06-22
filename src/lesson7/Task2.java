package lesson7;

//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//периметра всех фигур в массиве.

public class Task2 {

    public static void main(String[] args) {
        Figure[] array = new Figure[5];
        array[0] = new Circle(5);
        array[1] = new Rectangle(5, 6);
        array[2] = new Triangle(3, 4, 5);
        array[3] = new Circle(6);
        array[4] = new Triangle(9, 6, 8);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].perimeter();
        }
        System.out.printf("Perimeter all figure: %.2f", sum);
    }
}
