package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceBuilder;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.Parser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO {

    File inputFile = new File("resources/appliances_db.txt");
    Parser parser = new Parser();

    @Override
    public List<Appliance> find(Criteria criteria) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {
        String applianceType = criteria.getGroupSearchName();
        Map<String, Object> criteriaProperties = criteria.getProperties();
        List<Appliance> chosenAppliances = new ArrayList<>();
        Pattern pattern = Pattern.compile("^" + applianceType + " :");

        try (BufferedReader bReader = new BufferedReader(
                new FileReader(inputFile))) {

            String line = bReader.readLine();
            while (line != null) {
                if ("".equals(line)) {

                    line = bReader.readLine();
                    continue;
                }

                if (parser.isChosenAppliance(applianceType, line)) {

                    int matchCounter = 0;
                    for (Map.Entry<String, Object> property : criteriaProperties.entrySet()) {
                        String baseValue = parser.findParameter(property.getKey(), line);
                        if (baseValue != null && baseValue.equals(String.valueOf(property.getValue()))) {
                            matchCounter++;
                        }
                    }
                    if (matchCounter == criteriaProperties.size()) {
                        Appliance appliance = new ApplianceBuilder().build(applianceType, line);
                        chosenAppliances.add(appliance);
                    }

                }

                line = bReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Input file reading error");

        }

        return chosenAppliances;
    }
}




