package lesson4;

//Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//сообщение, что их нет.

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        int countzero = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                countzero++;
            }
        }
        System.out.println("Array is: " + Arrays.toString(array));
        if (countzero != 0) {
            System.out.println("Countzero = " + countzero);
        } else {
            System.out.println("No zero element!");
        }
    }
}
