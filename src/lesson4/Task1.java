package lesson4;

//Пройти по массиву, вывести все элементы в прямом и в обратном порядке.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input element of array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("The array is: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\nReverse the array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
