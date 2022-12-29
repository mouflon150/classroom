package SetAndMap;

import lombok.Data;
import lombok.ToString;

@Data
public class Car {

    private String carIdNumber;
    private int numberOfTheCar;

    public Car(String carIdNumber, int numberOfTheCar) {
        this.carIdNumber = carIdNumber;
        this.numberOfTheCar = numberOfTheCar;
    }

    @Override
    public String toString() {
        return "Car(" +
                "carIdNumber = " + carIdNumber +
                ", numberOfTheCar = " + numberOfTheCar +
                ')' + "\n";
    }
}
