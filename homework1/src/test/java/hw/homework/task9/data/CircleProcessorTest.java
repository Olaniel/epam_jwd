package hw.homework.task9.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CircleProcessorTest {

    private double r;
    private double expectedLength;
    private double expectedArea;

    public CircleProcessorTest(double r, double expectedLength, double expectedArea) {
        this.r = r;
        this.expectedLength = expectedLength;
        this.expectedArea = expectedArea;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {1, 6.28, 3.14},
                {18, 113.1, 1017.88},
                {82, 515.22, 21124.07},
                {60, 376.99, 11309.73}
        });
    }

    @Test
    public void getLength() {

        double actualLength = new CircleProcessor().getLength(r);
        Assert.assertEquals(expectedLength, actualLength, 0.01);

    }

    @Test
    public void getArea() {
        double actualArea = new CircleProcessor().getArea(r);
        Assert.assertEquals(expectedArea, actualArea, 0.01);
    }
}