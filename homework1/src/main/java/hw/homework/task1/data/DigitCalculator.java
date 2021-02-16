package hw.homework.task1.data;

public class DigitCalculator {

    public long getSquaresLastDigit(long input) {
        long lastInputDigit = input % 10;
        return ((lastInputDigit * lastInputDigit) % 10);
    }

}
