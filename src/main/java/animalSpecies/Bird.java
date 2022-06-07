package animalSpecies;

public class Bird {

    private static final String speciesName = "Bird";
    private String name;
    private Integer numberOfChromosomes;
    private String description;

    public Bird(String name, Integer numberOfChromosomes, String description) {
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
        return "Bird{" +
                "name='" + name + '\'' +
                ", numberOfChromosomes=" + numberOfChromosomes +
                ", description='" + description + '\'' +
                '}';
    }

    public Bird cloningMethod () {
        return new Bird(this.name,this.numberOfChromosomes,this.description);
    }

}
