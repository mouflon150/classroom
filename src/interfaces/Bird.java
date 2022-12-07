package interfaces;

public class Bird {

    private final String species;
    private final String name;

    public Bird(String species, String name) {
        this.species = species;
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Species: " + species + "\n" +
                "Name: " + name + "\n";
    }
}
