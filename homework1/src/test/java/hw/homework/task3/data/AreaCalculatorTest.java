package hw.homework.task3.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class AreaCalculatorTest {

    private double inputArea;
    private double expectedArea;

    public AreaCalculatorTest(double inputArea, double outputArea) {
        this.inputArea = inputArea;
        this.expectedArea = outputArea;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {14.0, 7.0},
                {68.0, 34.0},
                {27.0, 13.5},
                {98.0, 49.0}
        });
    }

    @Test
    public void getInscribedCirclesArea() {
        double actual = new AreaCalculator().getInscribedCirclesArea(inputArea);
        Assert.assertEquals(expectedArea, actual,0);
    }
}