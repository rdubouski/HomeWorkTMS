package lesson9;

public final class Dog extends Animal{

    private Dog() {

    }

    public static void eat(String food) {
        switch (food) {
            case "Meat": {
                System.out.println("Dog like meat");
                break;
            }
            case "Grass": {
                System.out.println("Dog doesn't like grass");
                break;
            }
            default: {
                System.out.println("Dog doesn't know this food");
            }
        }
    }

    public static void voice() {
        System.out.println("Dog voice");
    }
}
