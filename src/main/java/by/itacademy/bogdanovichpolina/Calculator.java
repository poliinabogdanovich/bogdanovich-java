package by.itacademy.bogdanovichpolina;

public class Calculator implements ICalculator {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a - b;
    }

    @Override
    public double divide(int a, int b) {
        return (double) a / b;
    }
}
