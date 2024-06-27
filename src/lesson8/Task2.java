package lesson8;

import java.lang.reflect.Field;

public class Task2 {

//Создать класс Apple и добавить в него поле color с модификатором доступа private и
//инициализировать его. В методе main другого класса создать объект Apple, и не
//используя сеттеры изменить значение поля color

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        apple.printColor();
        Field colorChange = apple.getClass().getDeclaredField("color");
        colorChange.setAccessible(true);
        colorChange.set(apple, "Green");
        apple.printColor();
    }
}
