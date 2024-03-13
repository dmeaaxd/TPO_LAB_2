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
        double result = x - 1;
        double term = x - 1;
        int n = 2;
        while (Math.abs(term) > precision) {
            term = Math.pow(x - 1, n) / n;
            result += term;
            n++;
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
