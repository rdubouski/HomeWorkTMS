package lesson5;

//Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
//Формат входных данных:
//Программа получает на вход два числа n и m.
//Формат выходных данных:
//Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3 символа.

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        System.out.print("Input m: ");
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = count;
                    count++;
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = count;
                    count++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
