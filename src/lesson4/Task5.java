package lesson4;

//Пройти по массиву и поменять местами элементы первый и последний, второй и
//предпоследний и т.д.

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array is: " + Arrays.toString(array));
        for (int i = 0; i < size / 2; i++) {
            array[i] = array[i] + array[size - i - 1];
            array[size - i - 1] = array[i] - array[size - i - 1];
            array[i] = array[i] - array[size - i - 1];
        }
        System.out.println("Modify array is: " + Arrays.toString(array));
    }
}
