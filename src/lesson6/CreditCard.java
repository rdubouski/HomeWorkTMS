package lesson6;

public class CreditCard {
    private int cardNumber;
    private int money;

    public CreditCard(int cardNumber, int money) {
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public void getMoney(int money) {
        this.money -= money;
    }

    public void printCard() {
        System.out.println("CreditCard{" +
                "cardNumber=" + cardNumber +
                ", money=" + money +
                '}');
    }
}
