package SetAndMap;

import lombok.Data;

@Data
public class VehicleData {

    private short yearOfCarManufacture;
    private String brand;
    private String carPrice;
    private Color color;

    public VehicleData(short yearOfCarManufacture, String brand, String carPrice, Color color) {
        this.yearOfCarManufacture = yearOfCarManufacture;
        this.brand = brand;
        this.carPrice = carPrice;
        this.color = color;
    }
    enum Color {
        WHITE, BLACK, GREY
    }

    @Override
    public String toString() {
        return " VehicleData(" +
                "yearOfCarManufacture = " + yearOfCarManufacture +
                ", brand = " + brand +
                ", carPrice = " + carPrice +
                ", color = " + color +
                ')' + "\n";
    }
}
