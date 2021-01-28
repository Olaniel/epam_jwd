package hw2.task4.data;

import hw2.interfaces.InputValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberInputValidator implements InputValidator {

    private final Pattern longNumberPattern = Pattern.compile(
            "^(-9223372036854775808|0)$|^((-?)((?!0)\\d{1,18}|[1-8]\\d{18}|9[0-1]\\d{17}|92[0-1]" +
                    "\\d{16}|922[0-2]\\d{15}|9223[0-2]\\d{14}|92233[0-6]\\d{13}|922337[0-1]" +
                    "\\d{12}|92233720[0-2]\\d{10}|922337203[0-5]\\d{9}|9223372036[0-7]" +
                    "\\d{8}|92233720368[0-4]\\d{7}|922337203685[0-3]\\d{6}|9223372036854[0-6]" +
                    "\\d{5}|92233720368547[0-6]\\d{4}|922337203685477[0-4]\\d{3}|9223372036854775[0-7]" +
                    "\\d{2}|922337203685477580[0-7]))$");

    @Override
    public boolean isValid(String inputString) {

        if (inputString != null) {
            String testString = inputString.trim();
            Matcher longNumberMatcher = longNumberPattern.matcher(testString);
            return longNumberMatcher.find();
        }

        return false;
    }

}
