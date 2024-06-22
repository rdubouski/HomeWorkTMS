package lesson7;

//Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
//который печатает название должности и имплементировать этот метод в созданные
//классы.

public class Task1 {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        boss.print();
        worker.print();
        accountant.print();
    }
}
