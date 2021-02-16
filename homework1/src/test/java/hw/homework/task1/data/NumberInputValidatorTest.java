package hw.homework.task1.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class NumberInputValidatorTest {

    private String input;
    private Boolean expected;

    public NumberInputValidatorTest(String input, Boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {"31434", true},
                {"", false},
                {"ds52", false},
                {"221.21", false}
        });
    }

    @Test
    public void isValid() {

        NumberInputValidator numberInputValidator = new NumberInputValidator();

        boolean actual = numberInputValidator.isValid(input);

        Assert.assertEquals(expected,actual);

    }
}