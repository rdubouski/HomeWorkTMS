package lesson12;

//Вывести в консоль из строки которую пользователь вводит с клавиатуры все
//аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
//только из прописных букв, без чисел.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String string = scanner.nextLine();
        String pattern = "[A-Z]{2,6}";

        Pattern compile = Pattern.compile(pattern);

        String[] strings = string.split(" ");
        for (String tmp : strings) {
            Matcher matcher = compile.matcher(tmp);
            if (matcher.matches()) {
                System.out.println(tmp);
            }
        }
    }
}
