package lesson7;

public class Accountant implements Printer{

    private String name;
    public Accountant() {
        name = "Accountant";
    }

    @Override
    public void print() {
        System.out.println("Post: " + name);
    }
}
