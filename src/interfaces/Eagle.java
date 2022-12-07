package interfaces;

public class Eagle extends Bird implements Flyable {

    public Eagle(String species, String name) {
        super(species, name);
    }

    @Override
    public void fly() {
        System.out.println("Могут летать на огромной скорости.");
    }

    @Override
    public void eat() {
        System.out.println("Питаются сусликами, кроликами, любыми курообразными.");
    }

    @Override
    public String toString() {
        return "\nEagle:\n" + super.toString();
    }
}
