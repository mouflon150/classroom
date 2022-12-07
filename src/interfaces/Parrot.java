package interfaces;

public class Parrot extends Bird implements Flyable {

    public Parrot(String species, String name) {
        super(species, name);
    }

    @Override
    public void fly() {
        System.out.println("Тоже могут летать по воздуху.");
    }

    @Override
    public void eat() {
        System.out.println("Попугаев кормят зерновыми смесями, которые состоят из проса, овса, льна и т.д.");
    }

    @Override
    public String toString() {
        return "\nParrot:\n" + super.toString();
    }
}
