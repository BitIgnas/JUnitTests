package example2;

public class CalculatorService {
    public int add(int x, int y) {
        return x + y;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public int makeDouble(int number) {
        return number * 2;
    }

    public double reverseSign(double a) {
        return -1 * a;
    }
}

