package lesson4;

//Найти индексы минимального и максимального элементов и вывести в консоль.

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int min = 9;
        int indexmin = 0;
        int max = 0;
        int indexmax = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
                indexmin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexmax = i;
            }
        }
        System.out.println("Array is: " + Arrays.toString(array));
        System.out.println("The minimum index number is: " + indexmin);
        System.out.println("The maximum index number is: " + indexmax);
    }
}
