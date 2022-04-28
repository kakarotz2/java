package Interfaces;

public class fx500 implements fx {

    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("chia so 0");
        }
        return b;
    }

}
