package hw.task.data;

import hw.task.parser.ApplianceParser;

import java.util.List;

public class DbService {

    ApplianceParser applianceParser = new ApplianceParser();

    public Double findMinValue(List<String> chosenAppliances, String parameterName) {


        double minValue = Double.MAX_VALUE;


        for (String string : chosenAppliances) {
            String stringParameter = applianceParser.findParameter(parameterName, string);
            if (stringParameter != null) {
                double value = Double.parseDouble(stringParameter);

                if (minValue > value) {
                    minValue = value;
                }
            }
        }
        if (Double.MAX_VALUE != minValue) {
            return minValue;
        } else return null;
    }

    public void printAppliancesWithParameterEquals(List<String> chosenAppliances,
                                                   String parameterName, double parameterValue) {
        int counter = 0;
        for (String string : chosenAppliances) {
            String stringParameter = applianceParser.findParameter(parameterName, string);
            double value = Double.parseDouble(stringParameter);
            if (value == parameterValue) {
                System.out.println(string);
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Nothing to print");
        }

    }
}
