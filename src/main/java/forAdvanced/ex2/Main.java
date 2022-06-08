package forAdvanced.ex2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Bird> birds = List.of
                (
                        new Bird("Hawk"),
                        new Bird("Raven"),
                        new Bird("Chicken")
                );

        List<Mammal> mammals = List.of
                (
                        new Mammal("Horse"),
                        new Mammal("Dog"),
                        new Mammal("Cat")
                );

        Animal.printList(birds);
        System.out.println("");
        Animal.printList(mammals);


    }



}
