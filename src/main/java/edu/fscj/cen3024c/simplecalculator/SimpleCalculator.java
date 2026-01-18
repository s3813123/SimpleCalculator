package edu.fscj.cen3024c.simplecalculator;

public class SimpleCalculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divide by zero is not allowed");
        }
        return a / b;
    }
}
