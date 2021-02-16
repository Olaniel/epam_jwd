package hw.testing;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class MyMathTest {

    private int x;
    private int y;
    private long expected;

    @Parameters
    public static Collection<Object[]> powTableValues() {
        return Arrays.asList(new Object[][]{
                {0, 0, 1},
                {1, 1, 1},
                {2, 2, 4},
                {10, 3, 1000}
        });
    }

    public MyMathTest(int x, int y, long expected) {
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void powTest001() {
        long actual;

        actual = MyMath.pow(x, y);

        Assert.assertEquals(expected, actual);
    }
}