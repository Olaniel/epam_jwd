package hw.task10.data;

public class TablePrinter {

    public static void printTable(double a, double b, double h) {

        System.out.println("_________________________");
        System.out.println("|\t  x\t\t| \tF(x)\t|");
        System.out.println("-------------------------");

        if (a <= b) {
            do {
                System.out.print("|");
                System.out.printf("%10.2f", a);
                System.out.print("\t|");
                System.out.printf("%10.2f", Math.tan(a));
                System.out.print("\t|");
                System.out.println();

                a += h;
            } while (a <= b);
        } else {
            do {
                System.out.print("|");
                System.out.printf("%10.2f", b);
                System.out.print("\t|");
                System.out.printf("%10.2f", Math.tan(b));
                System.out.print("\t|");
                System.out.println();

                b += h;
            } while (b <= a);
        }
        System.out.println("-------------------------");

    }

}
