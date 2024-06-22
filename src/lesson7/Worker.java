package lesson7;

public class Worker implements Printer{

    private String name;
    public Worker() {
        name = "Worker";
    }

    @Override
    public void print() {
        System.out.println("Post: " + name);
    }
}
