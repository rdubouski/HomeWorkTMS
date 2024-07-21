package lesson14;

//В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
//Проанализировать и записать в другой файл самое длинное слово.

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1 {

    public static void main(String[] args) {

        File fileIn = new File("src/lesson14/task1.txt");
        File fileOut = new File("src/lesson14/task1Out.txt");

        try {
            String text = Files.readString(Path.of(fileIn.toURI()));
            System.out.println(text);

            String[] strings = text.split("[\\s,.!?]");
            int max = 0;
            String maxString = "";
            for (String tmp : strings) {
                System.out.println(tmp);
                System.out.println(tmp.length());
                System.out.println(max);
                if (tmp.length() > max) {
                    maxString = tmp;
                    max = tmp.length();
                }
            }

            OutputStream outputStream = new FileOutputStream(fileOut);
            outputStream.write(maxString.getBytes());
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
