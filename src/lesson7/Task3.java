package lesson7;

//Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.

public class Task3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", "Red");
        Cat cat2 = cat1.clone();
        cat2.setName("Murka");
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
