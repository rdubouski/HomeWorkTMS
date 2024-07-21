package lesson13;

//Написать try/catch/finally, в котором finally вызван не будет

public class Task2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Zero");
            System.exit(0);
        } finally {
            System.out.println("Finally");
        }
    }
}
