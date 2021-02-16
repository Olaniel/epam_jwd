package hw.homework.task8.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class FunctionCalculatorTest {

    private double x;
    private double expected;

    public FunctionCalculatorTest(double x, double expected) {
        this.x = x;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {1, -0.2},
                {12, -99},
                {3, 9},
                {8, -31},
                {-3, -0.03}
        });
    }

    @Test
    public void calculate() {
        double actual = new FunctionCalculator().calculate(x);
        Assert.assertEquals(expected, actual, 0.001);
    }
}