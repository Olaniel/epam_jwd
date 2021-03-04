package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {


    public static boolean criteriaValidator(Criteria criteria) {
        if (criteria.getGroupSearchName() == null) {
            return false;
        } else {
            Pattern pattern = Pattern.compile("^[A-Za-z]+$");
            Matcher matcher = pattern.matcher(criteria.getGroupSearchName());
            if (matcher.find()) {
                return true;
            }
        }
        return false;
    }

}

