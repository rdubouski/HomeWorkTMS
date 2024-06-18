package lesson6;

public class ATM {

    private int b20;
    private int b50;
    private int b100;

    public ATM(int b20, int b50, int b100) {
        this.b20 = b20;
        this.b50 = b50;
        this.b100 = b100;
    }

    public void addMoney(int banknote, int value) {
        if (banknote == 20) {
            b20 += value;
        } else if (banknote == 50) {
            b50 += value;
        } else if (banknote == 100) {
            b100 += value;
        } else {
            System.out.println("Bad banknote");
        }
    }

    public boolean getMoney(int money) {
        int cM20 = 0, cM50 = 0, cM100 = 0, tmpMoney = money;

        if (tmpMoney / 100 != 0){
            cM100 = tmpMoney / 100;
            if (cM100 > b100){
                cM100 = b100;
            }
            tmpMoney -= 100 * cM100;
        }

        if (tmpMoney / 50 != 0){
            cM50 = tmpMoney / 50;
            if(cM50 > b50){
                cM50 = b50;
            }
            tmpMoney -= cM50 * 50;
        }

        if (tmpMoney / 20 != 0){
            cM20 = tmpMoney / 20;
            if(cM20 > b20){
                cM20 = b20;
            }
            tmpMoney -= cM20 * 20;
        }

        if (tmpMoney == 10 && (cM100 != 0 || cM50 != 0)){
            if (cM50 != 0){
                cM50--;
                cM20 += 3;
            } else {
                cM100--;
                cM50++;
                cM20 += 3;
            }
        }

        if (cM100 * 100 + cM50 * 50 + cM20 * 20 == money){
            b100 -= cM100;
            b50 -= cM50;
            b20 -= cM20;
            System.out.println("Success!");
            System.out.println("20 banknote: " + cM20 + "\n50 banknote: " + cM50 + "\n100 banknote: " + cM100);
            return true;
        } else {
            System.out.println("No money in ATM");
            return false;
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "b20=" + b20 +
                ", b50=" + b50 +
                ", b100=" + b100 +
                '}';
    }
}
