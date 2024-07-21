package lesson12;

//Программа на вход получает произвольный текст. В этом тексте может быть номер
//документа(один или несколько), емейл и номер телефона. Номер документа в формате:
//xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
//может содержать не всю информацию, т.е. например, может не содержать номер
//телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
//формате:
//email: teachmeskills@gmail.com
//document number: 1423-1512-51
//и т.д

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {
        String text = "1234-1234-12 ksdfj 9384fj asdf-qwer-32 +(12)3456789 sdkjfh qwerty@gmail.com sdf23jh@mail.cd +(1t)3456789";
        String regexMail = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        String regexNumber = "^[0-9]{4}+-[0-9]{4}+-[0-9]{2}$";
        String regexPhone = "^\\++\\([0-9]{2}+\\)+[0-9]{7}$";

        Pattern patternMail = Pattern.compile(regexMail);
        Pattern patternNumber = Pattern.compile(regexNumber);
        Pattern patternPhone = Pattern.compile(regexPhone);

        System.out.printf("Text: %s\n", text);
        String[] strings = text.split(" ");
        for (String tmp : strings) {
            Matcher matcher = patternMail.matcher(tmp);
            if (matcher.matches()) {
                System.out.printf("Email: %s\n", tmp);
            }
            matcher = patternNumber.matcher(tmp);
            if (matcher.matches()) {
                System.out.printf("Number: %s\n", tmp);
            }
            matcher = patternPhone.matcher(tmp);
            if (matcher.matches()) {
                System.out.printf("Phone: %s\n", tmp);
            }
        }
    }
}
