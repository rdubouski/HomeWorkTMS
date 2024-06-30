package lesson9;

public class Rabbit implements Animal {

    @Override
    public void eat(String food) {
        switch (food) {
            case "Meat": {
                System.out.println("Rabbit doesn't like meat");
                break;
            }
            case "Grass": {
                System.out.println("Rabbit like grass");
                break;
            }
            default: {
                System.out.println("Rabbit doesn't know this food");
            }
        }
    }

    @Override
    public void voice() {
        System.out.println("Rabbit voice");
    }
}
