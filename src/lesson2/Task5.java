package lesson2;

//Задача *:
//Напишите программу, где пользователь вводит любое целое положительное число. А
//программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
//числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
//ввести некорректные данные.

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number;
        int sum = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    sum += i;
                }

                System.out.println("The sum is: " + sum);
            }
        }else {
            System.out.println("Invalid input");
        }
    }
}
