package animal_tiger_chiken;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return " chiken --- cuục tác ";
    }
    public String howToEat(){
        return " luộc ";
    }
}
