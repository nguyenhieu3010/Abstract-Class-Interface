package animal_tiger_chiken;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        animals[2] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Chicken abc = (Chicken) animal;// ép kiểu
                System.out.println(abc.howToEat());;
            }
        }
    }
}
