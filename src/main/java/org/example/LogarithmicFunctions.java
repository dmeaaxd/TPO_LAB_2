package org.example;

public class LogarithmicFunctions {
    private double precision;

    public LogarithmicFunctions(double precision) {
        this.precision = precision;
    }

    public double ln(double x) {
        if (x <= 0) {
            return Double.NaN;
        }
        double result = 0;
        double term = x - 1; // Начальный член ряда
        double divisor = 1;
        while (Math.abs(term) > precision) {
            result += term / divisor;
            term *= -(x - 1); // Следующий член ряда
            divisor++;
        }
        return result;
    }

    public double log(double base, double x) {
        if (base <= 0 || x <= 0) {
            return Double.NaN;
        }
        return ln(x) / ln(base);
    }
}
