package org.example;

public class TrigonometricFunctions {

    private double precision;

    public TrigonometricFunctions(double precision) {
        this.precision = precision;
    }

    public double sin(double x) {
        double result = 0;
        double term = x;
        int n = 1;
        while (Math.abs(term) > precision) {
            result += term;
            term *= - (x * x) / ((2 * n) * (2 * n + 1));
            n++;
        }
        return result;
    }

    public double cos(double x) {
        double result = 1;
        double term = 1;
        int n = 1;
        while (Math.abs(term) > precision) {
            term *= - (x * x) / ((2 * n - 1) * (2 * n));
            result += term;
            n++;
        }
        return result;
    }

    public double tan(double x) {
        return sin(x) / cos(x);
    }

    public double cot(double x) {
        return 1 / tan(x);
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
