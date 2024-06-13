package lesson4;

//Задача 2:
//Найти минимальный-максимальный элементы и вывести в консоль

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        int min = 9;
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Array is: " + Arrays.toString(array));
        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
    }
}
