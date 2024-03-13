package org.example;

public class TrigonometricFunctions {

    public static double sin(double x, double precision) {
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

    public static double cos(double x, double precision) {
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

    public static double tan(double x, double precision) {
        return sin(x, precision) / cos(x, precision);
    }

    public static double cot(double x, double precision) {
        return 1 / tan(x, precision);
    }

    public static double ln(double x, double precision) {
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

    public static double log(double base, double x, double precision) {
        if (base <= 0 || x <= 0) {
            return Double.NaN;
        }
        return ln(x, precision) / ln(base, precision);
    }
}
