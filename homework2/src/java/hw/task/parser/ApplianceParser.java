package hw.task.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceParser {

    public List<String> chooseToList(String appliance, List<String> appliances) {
        List<String> stringList = new ArrayList<>();
        Pattern pattern = Pattern.compile("^" + appliance.toLowerCase() + " :");
        Matcher matcher;
        for (String line : appliances) {
            matcher = pattern.matcher(line.toLowerCase());
            if (matcher.find()) {
                stringList.add(line);
            }
        }
        return stringList;
    }

    public String findParameter(String parameter, String appliance) {
        String output = null;
        Pattern pattern = Pattern.compile(" " + parameter.toLowerCase() + "(=)(\\w)+(\\.)?(\\w)*");
        Matcher matcher = pattern.matcher(appliance.toLowerCase());
        if (matcher.find()) {
            output = matcher.group();
            int equalsIndex = output.indexOf('=');
            int commaIndex = output.indexOf(',');

            if (commaIndex != -1) {
                output = output.substring(equalsIndex + 1, commaIndex);
            } else {
                output = output.substring(equalsIndex + 1);
            }
        }
        return output;
    }

}
