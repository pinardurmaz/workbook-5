package com.pluralsight;
import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> myAssets = new ArrayList<>();

        // Evler
        myAssets.add(new House("My House", "2020-05-01", 250000,
                "123 Maple Street", 1, 1800, 5000));
        myAssets.add(new House("Vacation Home", "2018-07-10", 350000,
                "456 Lakeview Drive", 2, 2200, 8000));

        // Araçlar
        myAssets.add(new Vehicle("Tom's Truck", "2015-06-15", 30000,
                "Ford F-150", 2015, 120000));
        myAssets.add(new Vehicle("My Car", "2022-01-20", 25000,
                "Honda Civic", 2022, 45000));

        // Listeleme
        for (Asset asset : myAssets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println("-------------------------------");
        }
    }
}