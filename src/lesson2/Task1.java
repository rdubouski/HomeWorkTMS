package lesson2;

//Задача 1:
//Напишите программу, которая будет принимать на вход число из консоли и на выход
//будет выводить сообщение четное число или нет. Для определения четности числа
//используйте операцию получения остатка от деления (операция выглядит так: '% 2').

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
