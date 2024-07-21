package lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    public static boolean authentication(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        return checkLogin(login) && checkPassword(password, confirmPassword);
    }

    public static boolean checkLogin(String login) throws WrongLoginException{
        if (login.length() > 20) {
            throw new WrongLoginException("Wrong length login");
        } else if (login.contains(" ")) {
            throw new WrongLoginException("Wrong login");
        }
        return true;
    }

    public static boolean checkPassword(String password, String confirmPassword) throws WrongPasswordException{
        if (password.length() > 20) {
            throw new WrongPasswordException("Wrong length password");
        } else if (password.contains(" ")) {
            throw new WrongPasswordException("Wrong password");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("No equals password");
        } else {
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(password);
            if (!matcher.find()) {
                throw new WrongPasswordException("No digit");
            }
        }
        return true;
    }
}
