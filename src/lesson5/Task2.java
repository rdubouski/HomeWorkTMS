package lesson5;

//Создать программу для раскраски шахматной доски с помощью цикла. Создать
//двумерный массив String 8х8. С помощью циклов задать элементам массива значения
//B(Black) или W(White). При выводе результат работы программы должен быть
//следующим:
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        char[][] array = new char[8][8];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j % 2 == 0) {
                        array[i][j] = 'W';
                    } else {
                        array[i][j] = 'B';
                    }
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    if (j % 2 == 0) {
                        array[i][j] = 'B';
                    } else {
                        array[i][j] = 'W';
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
