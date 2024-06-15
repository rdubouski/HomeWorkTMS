package lesson4;

//Проверить, является ли массив возрастающей последовательностью (каждое следующее
//число больше предыдущего).

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array is: " + Arrays.toString(array));
        int tmp = array[0];
        boolean check = true;
        for (int i = 1; i < size; i++) {
            if (tmp >= array[i]) {
                check = false;
                break;
            } else {
                tmp = array[i];
            }
        }
        System.out.println(check);
    }
}
