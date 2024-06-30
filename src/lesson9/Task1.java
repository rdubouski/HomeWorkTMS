package lesson9;

//Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
//Переопределить методы voice(), eat(String food) чтобы они выводили верную
//информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
//Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
//туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
//или другую строку то он будет недоволен.

//Написать такой конструктор, который запретит создание объекта класса Dog в других
//классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
//обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
//способа.

public class Task1 {

    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Tiger.voice();
        Tiger.eat("Meat");

        Animal rabbit = new Rabbit();
        Rabbit.voice();
        Rabbit.eat("Meat");

        //Animal dog = new Dog();
        Dog.voice();
        Dog.eat("Meat");

    }
}
