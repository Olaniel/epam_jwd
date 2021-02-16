package hw.homework.task6.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class TimeProcessorTest {

    private int inputSeconds;
    private Map<String, Integer> expected;

    public TimeProcessorTest(int inputSeconds, Map<String, Integer> expected) {
        this.inputSeconds = inputSeconds;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("hours", 5);
        map1.put("minutes", 12);
        map1.put("seconds", 45);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("hours", 10);
        map2.put("minutes", 43);
        map2.put("seconds", 52);
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("hours", 15);
        map3.put("minutes", 47);
        map3.put("seconds", 3);
        Map<String, Integer> map4 = new HashMap<>();
        map4.put("hours", 12);
        map4.put("minutes", 0);
        map4.put("seconds", 10);
        return Arrays.asList(new Object[][]{
                {18765, map1},
                {38632, map2},
                {56823, map3},
                {43210, map4}
        });
    }

    @Test
    public void getHoursMinutesSeconds() {
        Map<String,Integer> actual = new TimeProcessor().getHoursMinutesSeconds(inputSeconds);
        Assert.assertEquals(expected,actual);
    }
}