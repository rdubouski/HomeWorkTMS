package lesson6;

//Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//выводит текущую информацию о карточке. Напишите программу, которая создает три
//объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//третьей. Выведите на экран текущее состояние всех трех карточек.

public class Task1 {

    public static void main(String[] args) {
        CreditCard visa = new CreditCard(11111111, 1000);
        CreditCard mc = new CreditCard(22222222, 2000);
        CreditCard mir = new CreditCard(33333333, 3000);
        visa.addMoney(1000);
        mc.addMoney(2000);
        mir.getMoney(1000);
        visa.printCard();
        mc.printCard();
        mir.printCard();
    }
}