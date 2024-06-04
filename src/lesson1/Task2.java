package lesson1;

//Задача 2:
//В переменной n хранится двузначное число. Создайте программу, вычисляющую и
//выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
//(2+6)

public class Task2 {

    public static void main(String[] args) {
        int n = 26;
        int result;
        result = (n / 10) + (n % 10);
        System.out.println("result: " + result);
    }
}
