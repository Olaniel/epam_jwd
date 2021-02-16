package hw.homework.task7.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CoordinateInputValidatorTest {

    private String input;
    private Boolean expected;

    public CoordinateInputValidatorTest(String input, Boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {"31434", true},
                {"", false},
                {"ds52", false},
                {"221.21", true}
        });
    }

    @Test
    public void isValid() {
        boolean actual = new CoordinateInputValidator().isValid(input);
        Assert.assertEquals(expected, actual);
    }
}