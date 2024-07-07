package lesson10;

import java.util.Objects;

public class User implements Cloneable{

    private static int count = 0;
    private int id;
    private String name;
    private int age;

    public User(String name, int age) {
        this.id = count;
        this.name = name;
        this.age = age;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static User myClone(User[] users, int check, int id) throws CloneNotSupportedException {
        User newUser = null;
        if (check == 0) {
            newUser = users[id];
        } else if (check == 1) {
            newUser = users[id].clone();
        }
        return newUser;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
