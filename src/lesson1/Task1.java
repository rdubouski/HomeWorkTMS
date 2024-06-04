package lesson1;

//Задача 1:
//Написать приложение, которое будет вычислять и выводить значение по формуле:
//a=4*(b+c-1)/2; b и c задаем в коде самостоятельно

public class Task1 {

    public static void main(String[] args) {
        int a;
        int b = 10;
        int c = 11;
        a = 4 * (b + c - 1) / 2;
        System.out.println("a = " + a);
    }
}
