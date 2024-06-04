package lesson2;

//Задача 4:
//Необходимо, чтоб программа выводила на экран вот такую последовательность:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.

public class Task4 {

    public static void main(String[] args) {
        for (int i = 1; i <= 14; i++) {
            System.out.print(i * 7 + " ");
        }
    }
}
