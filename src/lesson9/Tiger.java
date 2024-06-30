package lesson9;

public class Tiger extends Animal{

    public static void eat(String food) {
        switch (food) {
            case "Meat": {
                System.out.println("Tiger like meat");
                break;
            }
            case "Grass": {
                System.out.println("Tiger doesn't like grass");
                break;
            }
            default: {
                System.out.println("Tiger doesn't know this food");
            }
        }
    }

    public static void voice() {
        System.out.println("Tiger voice");
    }
}
