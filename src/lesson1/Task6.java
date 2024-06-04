package lesson1;

//Задача *:
//Написать программу которая будет менять местами значение целочисленных
//переменны, использовать только 2 входные переменные (a,b);

public class Task6 {

    public static void main(String[] args) {
        int a = 1; int b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("reverse");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
