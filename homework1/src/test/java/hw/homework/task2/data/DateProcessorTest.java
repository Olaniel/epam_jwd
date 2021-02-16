package hw.homework.task2.data;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class DateProcessorTest {

    private int inputYear;
    private boolean isLeapExpected;
    private int inputMonth;
    private int expectedDaysInMonth;

    public DateProcessorTest(int inputYear, boolean isLeapExpected, int month, int expectedDaysInMonth) {
        this.inputYear = inputYear;
        this.isLeapExpected = isLeapExpected;
        this.inputMonth = month;
        this.expectedDaysInMonth = expectedDaysInMonth;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {2000, true, 10, 31},
                {1957, false, 1, 31},
                {2400, true, 2, 29},
                {1041, false, 6, 30}
        });
    }

    @org.junit.Test
    public void isLeapYear() {
        DateProcessor dateProcessor = new DateProcessor();
        boolean actual = DateProcessor.isLeapYear(inputYear);

        Assert.assertEquals(isLeapExpected, actual);
    }

    @org.junit.Test
    public void getDaysInMonth() {

        int actual = new DateProcessor().getDaysInMonth(inputMonth, inputYear);

        Assert.assertEquals(expectedDaysInMonth, actual);
    }
}