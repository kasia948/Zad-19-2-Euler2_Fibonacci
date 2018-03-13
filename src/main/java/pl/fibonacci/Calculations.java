package pl.fibonacci;
public class Calculations {

    public long calculateEvenValuedFibonacciSum(int max) {
        long sum = 0;
        long x = 0;
        long y = 1;
        long z = x + y;

        while (z < max) {
            x = y;
            y = z;
            z = x + y;
            if (z % 2 == 0) {
                sum = sum + z;
            }
        }
        return sum;
    }
}
