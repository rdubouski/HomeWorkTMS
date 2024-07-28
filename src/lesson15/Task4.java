package lesson15;

//Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
//работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
//основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
//классов(т.е. это generic).
//Предусмотреть операции(методы):
//- добавления элемента
//- удаления элемента
//- получение элемента по индексу
//- проверка есть ли элемент в коллекции
//- очистка всей коллекции
//Предусмотреть конструктор без параметров - создает массив размером
//по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
//массива. Предусмотреть возможность автоматического расширения коллекции при
//добавлении элемента в том случае, когда коллекция уже заполнена


public class Task4 {

    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(10);
        myArrayList.add(20);
        System.out.println(myArrayList);


    }
}
