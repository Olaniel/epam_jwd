package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;
import java.util.Map;

public class PrintApplianceInfo {

    public static void print(Appliance appliance) {

        if (appliance != null) {
            String type = appliance.getType();
            Map<String, Object> propertyMap = appliance.getProperties();
            System.out.println();
            System.out.print("Appliance type is ");
            System.out.println(type);
            if (!propertyMap.isEmpty()) {
                System.out.println("Properties:");
                String propertyString;
                for (Map.Entry<String, Object> property : propertyMap.entrySet()) {
                    propertyString = property.getKey().toLowerCase() + "=" + property.getValue();
                    System.out.println(propertyString);
                }
            }

        } else {
            System.out.println("Nothing to print");
        }
    }

    public static void print(List<Appliance> searchResult) {

        if (searchResult != null && !searchResult.isEmpty()) {
            for (Appliance appliance : searchResult) {
                print(appliance);
            }
            System.out.println("-----------------------");
        } else {
            System.out.println("Nothing to print");
        }
    }


}
