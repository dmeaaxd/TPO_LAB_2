package org.example;

public class LogarithmicFunctions {
    private final double precision;

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
        double lastTerm = term + 10 * precision;
        int n = 1;
        while (Math.abs(currentTerm - lastTerm) > precision) {
            result += currentTerm;
            lastTerm = currentTerm;
            currentTerm *= term * term * (2 * n - 1) / (2 * n + 1);
            n++;
        }
        result *= 2;
        CsvHandler.writeToCsv("ln", x, result);
        return result;
    }

    public double log(double base, double x) {
        if (base <= 0 || x <= 0) {
            return Double.NaN;
        }
        double result = ln(x) / ln(base);
        CsvHandler.writeToCsv("log"+(int)base, x, result);
        return result;
    }

}
