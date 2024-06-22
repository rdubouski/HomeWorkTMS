package lesson7;

public class Boss implements Printer{

    private String name;
    public Boss() {
        name = "Boss";
    }

    @Override
    public void print() {
        System.out.println("Post: " + name);
    }
}
