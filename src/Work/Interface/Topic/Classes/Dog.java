package Work.Interface.Topic.Classes;

import Work.Interface.Topic.Interfaces.Animal;

public class Dog extends AbstractAnimal {

    @Override
    public void say() {
        System.out.println("Baw");
    }

}
