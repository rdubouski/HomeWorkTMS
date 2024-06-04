package lesson2;

//Задача 2:
//Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
//Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a temperature: ");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}
