package lesson15;

import java.util.Arrays;

public class MyArrayList<T> {

    private Object[] value;
    private int index = 0;

    public MyArrayList() {
        this.value = new Object[0];
    }

    public void add(T element) {
        System.out.println(value.length);
        System.out.println(index);
        if (value.length >= index) {
            this.value = changeSize(this.value);
        }
        this.value[index++] = element;
    }

    public int getSize() {
        return value.length;
    }

    public Object[] changeSize(Object[] array) {
        int newSize = array.length + 1;
        Object[] newArray = new Object[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(value);
    }
}
