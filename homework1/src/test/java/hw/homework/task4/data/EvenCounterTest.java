package hw.homework.task4.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class EvenCounterTest {

    private long[] inputNumbers;
    private int expectedCounter;

    public EvenCounterTest(long[] inputNumbers, int expectedCounter) {
        this.inputNumbers = inputNumbers;
        this.expectedCounter = expectedCounter;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {new long[]{12, 3, 1, 5},   1},
                {new long[]{8, 19, 7, 2},   2},
                {new long[]{46, 34, 11, 52}, 3},
                {new long[]{12, 38, 14, 58}, 4}
        });
    }

    @Test
    public void count() {
        int actual = new EvenCounter().count(inputNumbers);

        Assert.assertEquals(expectedCounter, actual);
    }
}