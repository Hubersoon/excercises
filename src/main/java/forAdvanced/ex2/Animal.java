package forAdvanced.ex2;

import java.util.List;

public abstract class Animal<T> {

    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public static void printList(List<? extends Animal> list) {
        for (Animal m : list) {
            System.out.println(m.getSpecies());
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}

