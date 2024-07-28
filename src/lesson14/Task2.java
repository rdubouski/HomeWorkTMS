package lesson14;

//Допустим есть txt файл с номерами документов. Номером документа является строка,
//состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
//номер документа с новой строки и в строке никакой другой информации, только номер
//документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
//последовательности docnum(далее любая последовательность букв/цифр) или
//contract(далее любая последовательность букв/цифр). Написать программу для чтения
//информации из входного файла - путь к входному файлу должен задаваться через
//консоль. Программа должна проверять номера документов на валидность. Валидные
//номера документов следует записать в один файл-отчет. Невалидные номера документов
//следует записать в другой файл-отчет, но после номеров документов следует добавить
//информацию о том, почему этот документ не валиден

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        String path;
        File fileIn;
        String pathOutCorrect = "D:\\Programming\\Java\\project\\HomeWorkTMS\\src\\lesson14\\Task2OutCor.txt";
        String pathOutIncorrect = "D:\\Programming\\Java\\project\\HomeWorkTMS\\src\\lesson14\\Task2OutIncor.txt";

        //System.out.print("\nВведите путь к папке: ");
        //path = scanner.nextLine();
        path = "src/lesson14/Task2In.txt";
        fileIn = new File(path);

        if (fileIn.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileIn))) {
                String readString;
                while ((readString = bufferedReader.readLine()) != null) {
                    if (readString.length() != 15) {
                        myWrite(readString + " не верная длинна номера\n", pathOutIncorrect);
                    } else if (readString.indexOf("docnum") == 0) {
                        String pattern = "(docnum)+[A-Za-z0-9]{9}";
                        Pattern compile = Pattern.compile(pattern);
                        Matcher matcher = compile.matcher(readString);
                        if (matcher.matches()) {
                            myWrite(readString + "\n", pathOutCorrect);
                        } else {
                            myWrite(readString + " не верная длинна номера\n", pathOutIncorrect);
                        }
                    } else if (readString.indexOf("contract") == 0) {
                        String pattern = "(contract)+[A-Za-z0-9]{7}";
                        Pattern compile = Pattern.compile(pattern);
                        Matcher matcher = compile.matcher(readString);
                        if (matcher.matches()) {
                            myWrite(readString + "\n", pathOutCorrect);
                        } else {
                            myWrite(readString + " не верная длинна номера\n", pathOutIncorrect);
                        }
                    } else {
                        myWrite(readString + " документ должен начинаться с docnum или contract\n", pathOutIncorrect);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("\nТакого файла не существует!\n");
        }
    }

    public static void myWrite(String string, String path) {

        File fileOut;
        fileOut = new File(path);
        try (FileWriter fileWriter = new FileWriter(fileOut, true)) {
            fileWriter.write(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
