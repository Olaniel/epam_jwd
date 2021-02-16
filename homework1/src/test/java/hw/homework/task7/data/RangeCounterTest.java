package hw.homework.task7.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class RangeCounterTest {

    private double x;
    private double y;
    private double expected;

    public RangeCounterTest(double x, double y, double expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {3.0, 4.0, 5.0},
                {6, 8, 10},
                {54, 22, 58.31},
                {11, 13, 17.03}
        });
    }

    @Test
    public void count() {
        double actual = new RangeCounter().count(x, y);
        Assert.assertEquals(expected, actual, 0.01);
    }
}