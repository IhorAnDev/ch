package Work.Interface.Topic.Classes;

import Work.Interface.Topic.Interfaces.Animal;

public class Main {
    public static void main(String[] args) {

        Cat lori = new Cat();
        Dog macler = new Dog();

        findOwner(lori);
        findOwner(macler);

        System.out.println("Lori: " + lori.getOwner() +
                " Macler: " + macler.getOwner());
    }

    private static void findOwner(Animal animal) {
        if (animal.getClass() == Cat.class) {
            animal.setOwner(" Owner cat");
        }
        if (animal.getClass() == Dog.class) {
            animal.setOwner(" Owner Dog");
        }
    }
}
