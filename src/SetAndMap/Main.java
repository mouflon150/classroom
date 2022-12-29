package SetAndMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Car, VehicleData> dataMap = new HashMap<>();

        dataMap.put(new Car("5YRSA1DG9FP14705", 177),
                new VehicleData((short) 2022, "Toyota Land Cruiser", "$80,873", VehicleData.Color.WHITE));
        dataMap.put(new Car("1GMBH41XMING109186", 100),
                new VehicleData((short) 2015, "Daewoo Matiz M150", "150,000руб", VehicleData.Color.GREY));
        dataMap.put(new Car("4S3KBM68B3286050", 7566),
                new VehicleData((short) 2021, "Honda Civic", "$24,650", VehicleData.Color.BLACK));

        for (Map.Entry<Car, VehicleData> carVehicleDataEntry : dataMap.entrySet()) {
            System.out.println(carVehicleDataEntry);
        }
    }
}
