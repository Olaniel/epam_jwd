package hw.homework.task6.data;

import java.util.HashMap;
import java.util.Map;

public class TimeProcessor {

    public Map<String, Integer> getHoursMinutesSeconds(int inputSeconds) {
        Map<String, Integer> map = new HashMap<>();

        int seconds = inputSeconds % 60;
        map.put("seconds", seconds);

        inputSeconds = (inputSeconds - seconds) / 60;
        int minutes = inputSeconds % 60;
        map.put("minutes", minutes);

        inputSeconds = (inputSeconds - minutes) / 60;
        int hours = inputSeconds % 60;
        map.put("hours", hours);

        return map;
    }

}
