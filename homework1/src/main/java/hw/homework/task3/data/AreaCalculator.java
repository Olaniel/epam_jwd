package hw.homework.task3.data;

public class AreaCalculator {

/*
    Исходя из того,что величина стороны большего квадрата равна величине диагонали меньшего квадрата,
    после выражения площадей квадратов через величину стороны меньшего квадрата,
    получим что площадь вписанного квадрата меньше площади большего квадрата в два раза.
*/
    public double getInscribedCirclesArea(double inputArea) {
        return inputArea / 2;
    }
}
