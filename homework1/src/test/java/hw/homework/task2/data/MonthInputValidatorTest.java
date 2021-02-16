package hw.homework.task2.data;

import hw.homework.task1.data.NumberInputValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class MonthInputValidatorTest {
    private String input;
    private Boolean expected;

    public MonthInputValidatorTest(String input, Boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {"34", false},
                {"", false},
                {"12", true},
                {"1", true}
        });
    }


    @Test
    public void isValid() {
        MonthInputValidator monthInputValidator = new MonthInputValidator();

        boolean actual = monthInputValidator.isValid(input);

        Assert.assertEquals(expected, actual);
    }
}
