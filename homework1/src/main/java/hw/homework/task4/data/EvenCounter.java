package hw.homework.task4.data;

public class EvenCounter {

    public int count(long[] numbers) {
        int counter = 0;
        for (long value : numbers) {
            if (value % 2 == 0) counter++;
        }
        return counter;
    }

}
