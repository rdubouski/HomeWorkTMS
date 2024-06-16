package lesson5;

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
