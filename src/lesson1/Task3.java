package lesson1;

//Задача 3:
//В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
//выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
//9 (1+2+6)

public class Task3 {

    public static void main(String[] args) {
        int n = 126;
        int result;
        result = (n / 100) + ((n % 100) / 10) + (n % 10);
        System.out.println("result: " + result);
    }
}
