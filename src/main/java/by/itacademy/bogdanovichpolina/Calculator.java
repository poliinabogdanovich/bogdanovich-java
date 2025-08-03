package by.itacademy.bogdanovichpolina;

public class Calculator implements ICalculator {
    @Override
    public int sum(int a, int b) throws ArithmeticException {
        try {
            return Math.addExact(a, b);
        } catch (Exception e) {
            throw new ArithmeticException("Выход за границы диапазона значений" + e.getMessage());
        }
    }

    @Override
    public int subtract(int a, int b) throws ArithmeticException {
        try {
            return Math.subtractExact(a, b);
        } catch (Exception e) {
            throw new ArithmeticException("Выход за границы диапазона значений" + e.getMessage());
        }
    }

    @Override
    public int multiply(int a, int b) {
        try {
            return Math.multiplyExact(a, b);
        } catch (Exception e) {
            throw new ArithmeticException("Выход за границы диапазона значений" + e.getMessage());
        }
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка деления на ноль");
        }
        return (double) a / b;
    }
}
