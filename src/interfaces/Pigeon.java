package interfaces;

public class Pigeon extends Bird implements Flyable {

    public Pigeon(String species, String name) {
        super(species, name);
    }

    @Override
    public void fly() {
        System.out.println("Обычно летают по крышам домов.");
    }

    @Override
    public void eat() {
        System.out.println("Едят то же, что и попугаи.");
    }

    @Override
    public String toString() {
        return "\nPigeon:\n" + super.toString();
    }
}
