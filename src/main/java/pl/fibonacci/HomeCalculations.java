package pl.fibonacci;

public class HomeCalculations {
    public static void main(String[] args) {
        Calculations calculations= new Calculations();
        long i = calculations.calculateEvenValuedFibonacciSum(4000000);
        System.out.println(i);
    }
}
