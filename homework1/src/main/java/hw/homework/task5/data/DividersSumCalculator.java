package hw.homework.task5.data;

public class DividersSumCalculator {

    public long sumDividers(long input) {

        long dividersSum = 0;

        for (long i = 1; i < input; i++) {

            if (input % i == 0) {
                dividersSum += i;
            }
        }
        return dividersSum;
    }

}
