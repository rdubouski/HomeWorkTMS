package lesson10;

//Задача 1:
//Создать класс для описания пользователя системы. Переопределить в классе методы
//toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
//значением полей и сравнить с помощью метода equals.
//Задача *:
//Создать программу для реализации поверхностного и глубокого клонирования объекта
//класса User. Пусть на вход программе будет передаваться тип операции клонирования
//(поверхностное клонирование или глубокое), а также id юзера для клонирования.

public class Task1 {

    public static void main(String[] args) throws CloneNotSupportedException {

        User pasha = new User("Паша", 23);
        User pashtet = new User("Паша", 23);
        User mike = new User("Майк", 23);

        System.out.println("Pasha = " + pasha);
        System.out.println("Pashtet = " + pashtet);
        System.out.println("Mike = " + mike);
        System.out.println();

        System.out.println("Hash Pasha = " + pasha.hashCode());
        System.out.println("Hash Pashtet = " + pashtet.hashCode());
        System.out.println("Hash Mike = " + mike.hashCode());
        System.out.println();

        System.out.println("Pasha == Pashtet? - " + pasha.equals(pashtet));
        System.out.println("Pasha == Mike? - " + pasha.equals(mike));
        System.out.println();

        User[] arrayUser = new User[User.getCount()];
        arrayUser[0] = pasha;
        arrayUser[1] = pashtet;
        arrayUser[2] = mike;

        System.out.println("Clone");
        User oleg;
        oleg = User.myClone(arrayUser, 0, 0);
        System.out.println("Oleg = " + oleg);
        oleg.setName("Олег");
        System.out.println("Pasha = " + pasha);
        System.out.println("Oleg = " + oleg);

        System.out.println("\nDeep clone");
        User roma;
        roma = User.myClone(arrayUser, 1, 2);
        System.out.println("Roma = " + roma);
        roma.setName("Рома");
        System.out.println("Mike = " + mike);
        System.out.println("Roma = " + roma);

    }
}
