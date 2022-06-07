package animalSpecies;

public class Main {

    public static void main(String[] args) {

        Bird hawk = new Bird("Hawk", 68, "A rare bird of prey.");
        Bird penguin = new Bird("Penguin", 92, "Birds inhabiting the cold seas of the southern hemisphere.");
        Mammal tiger = new Mammal("Tiger", 38, "The largest predatory cat in the world.");
        Mammal dolphin = new Mammal("Dolphin", 44, "Marine mammal, predator.");

        System.out.println(hawk.getFullName());
        System.out.println(penguin.getNumberOfChromosomes());
        System.out.println(tiger);
        Mammal newDolphin = dolphin.cloningMethod();
        System.out.println(newDolphin);
    }

}
