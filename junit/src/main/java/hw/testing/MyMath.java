package hw.testing;

public class MyMath {

    public static long pow(int x, int y){
        long result = 1;

        for(int i=0; i<y; i++){
            result = result * x;
        }

        return result;
    }
}