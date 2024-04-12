package animal_tiger_chiken;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return " tiger----bla bla";
    }
    public String howToEat(){
        return " ăn thịt";
    }
}
