package animalSpecies;

public class Mammal {

    private static final String speciesName = "Mammal";
    private String name;
    private Integer numberOfChromosomes;
    private String description;

    public Mammal(String name, Integer numberOfChromosomes, String description) {
        this.name = name;
        this.numberOfChromosomes = numberOfChromosomes;
        this.description = description;
    }


    public String getFullName() {
        return "Species: " + speciesName + ", animal name: " + name;
    }

    public Integer getNumberOfChromosomes() {
        return numberOfChromosomes;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", numberOfChromosomes=" + numberOfChromosomes +
                ", description='" + description + '\'' +
                '}';
    }

    public Mammal cloningMethod () {
        return new Mammal(this.name,this.numberOfChromosomes,this.description);
    }

}

