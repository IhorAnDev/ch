package Work.Interface.Topic.Classes;

import Work.Interface.Topic.Interfaces.Animal;

public class Cat extends AbstractAnimal {


    @Override
    public void say() {
        System.out.println("Meow");
    }
}
