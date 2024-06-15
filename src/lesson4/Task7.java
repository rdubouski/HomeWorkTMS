package lesson4;

//Имеется массив из неотрицательных чисел(любой). Представьте что массив
//представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
//добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
//содержит нуля в начале, кроме самого числа 0.
//Пример:
//Input: [1,4,0,5,6,3]
//Output: [1,4,0,5,6,4]
//Input: [9,9,9]
//Output: [1,0,0,0]

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input element of array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(array));
        int number = 0;
        for (int i = 0; i < size; i++) {
            number = number * 10 + array[i];
        }
        number++;
        int countn = number;
        int count = 0;
        while (countn != 0) {
            countn /= 10;
            count++;
        }
        int[] newArray;
        if (count > size) {
            newArray = new int[count];
            for (int i = count - 1; i >= 0; i--) {
                newArray[i] = number % 10;
                number /= 10;
            }
        } else {
            newArray = new int[size];
            for (int i = size - 1; i >= 0; i--) {
                newArray[i] = number % 10;
                number /= 10;
            }
        }
        System.out.println("New array is: " + Arrays.toString(newArray));
    }
}
