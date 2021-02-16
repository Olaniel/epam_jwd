package hw.homework.task8.data;

public class FunctionCalculator {

    public double calculate(double x) {
        double result;
        if (x >= 3) {
            result = 9 - Math.pow(x, 2) + 3 * x;
        } else {
            result = 1 / (Math.pow(x, 3) - 6);
        }
        return result;
    }

}
