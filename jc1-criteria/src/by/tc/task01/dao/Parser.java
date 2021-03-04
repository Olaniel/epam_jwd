package by.tc.task01.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public boolean isChosenAppliance(String applianceType, String line) {
        Pattern pattern = Pattern.compile("^" + applianceType.toLowerCase() + " :");
        Matcher matcher = pattern.matcher(line.toLowerCase());
        return matcher.find();
    }

    public String findParameter(String parameter, String line) {
        String output = null;
        Pattern pattern = Pattern.compile(" " + parameter
                + "(=)(\\w)+(\\.)?(\\w)*((-)(\\w)+(\\.)?(\\w)*)*");
        Matcher matcher = pattern.matcher(line);
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

    public List<String> parseParameters(String line) {
        List<String> outputList = new ArrayList<>();
        String output;
        Pattern pattern = Pattern.compile("(\\w)*(=)");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            output = line.substring(matcher.start(), matcher.end() - 1);
            outputList.add(output);
        }
        return outputList;
    }
}
