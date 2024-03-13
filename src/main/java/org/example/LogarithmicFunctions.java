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
        double term = (x - 1) / (x + 1);
        double currentTerm = term;
        int n = 1;
        while (Math.abs(currentTerm) > precision) {
            result += currentTerm;
            currentTerm *= term * term * (2 * n - 1) / (2 * n + 1);
            n++;
        }
        return 2 * result;
    }

    public double log(double base, double x) {
        if (base <= 0 || x <= 0) {
            return Double.NaN;
        }
        return ln(x) / ln(base);
    }

}
