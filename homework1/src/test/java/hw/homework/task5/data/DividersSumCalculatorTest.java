package hw.homework.task5.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class DividersSumCalculatorTest {

    private long input;
    private long expectedValue;

    public DividersSumCalculatorTest(long input, long expectedValue) {
        this.input = input;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {12, 16},
                {15, 9},
                {22, 14},
                {5, 1}
        });
    }

    @Test
    public void sumDividers() {
        long actual = new DividersSumCalculator().sumDividers(input);
        Assert.assertEquals(expectedValue, actual);
    }
}