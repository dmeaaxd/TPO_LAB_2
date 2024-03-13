package org.example;

public class TrigonometricFunctions {

    private final double precision;

    public TrigonometricFunctions(double precision) {
        this.precision = precision;
    }

    public double sin(double x) {
        double result = 0;
        double term = x;
        double lastTerm = term + 10 * precision;
        int n = 1;
        while (Math.abs(term - lastTerm) > precision) {
            result += term;
            lastTerm = term;
            term *= -(x * x) / ((2 * n) * (2 * n + 1));
            n++;
        }
        CsvWriter.writeToCsv("sin", x, result);
        return result;
    }

    public double cos(double x) {
        double result = 1;
        double term = 1;
        double lastTerm = term + 10 * precision;
        int n = 1;
        while (Math.abs(term - lastTerm) > precision) {
            lastTerm = term;
            term *= -(x * x) / ((2 * n - 1) * (2 * n));
            result += term;
            n++;
        }
        CsvWriter.writeToCsv("cos", x, result);
        return result;
    }

    public double tan(double x) {
        double result = sin(x) / cos(x);
        CsvWriter.writeToCsv("tan", x, result);
        return result;
    }

    public double cot(double x) {
        double result = 1 / tan(x);
        CsvWriter.writeToCsv("cot", x, result);
        return result;
    }
}
