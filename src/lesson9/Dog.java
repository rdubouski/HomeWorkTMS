package lesson9;

public class Dog implements Animal{

    @Override
    public void eat(String food) {
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

    @Override
    public void voice() {
        System.out.println("Dog voice");
    }
}
