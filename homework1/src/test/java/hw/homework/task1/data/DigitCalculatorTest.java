package hw.homework.task1.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class DigitCalculatorTest {

    private long inputNumber;
    private long expectedOutput;

    public DigitCalculatorTest(long inputNumber, long expectedOutput) {
        this.inputNumber = inputNumber;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {2110, 0},
                {6451, 1},
                {3452, 4},
                {14, 6}
        });
    }


    @Test
    public void getSquaresLastDigit() {

        DigitCalculator digitCalculator = new DigitCalculator();

        long actual = digitCalculator.getSquaresLastDigit(inputNumber);

        Assert.assertEquals(expectedOutput,actual);
    }
}