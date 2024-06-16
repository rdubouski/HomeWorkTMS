package lesson5;

//1.1 Создать двумерный массив, заполнить его случайными числами.
//1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
//1.3 Найти сумму всех получившихся элементов и вывести в консоль.

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + number;
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum);
    }
}
