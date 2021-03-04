package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceBuilder {

    Parser parser = new Parser();

    @SuppressWarnings("deprecation")
    public Appliance build(String applianceType, String line) throws ClassNotFoundException,
            IllegalAccessException,
            InstantiationException {

        Map<String, Object> propertyMap = new HashMap<>();
        List<String> propertyList = parser.parseParameters(line);
        String classType = "by.tc.task01.entity." + applianceType;
        for (String property : propertyList) {
            propertyMap.put(property, parser.findParameter(property, line));
        }
        Appliance appliance = (Appliance) Class.forName(classType).newInstance();
        appliance.setType(applianceType);
        appliance.setProperties(propertyMap);
        return appliance;
    }

}
