package org.example.mocs;

import org.example.CsvHandler;

public class TrigonometricFunctionsMocs {

    public double sin(double x) {
        return Math.sin(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }

    public double tan(double x) {
        double result = sin(x) / cos(x);
        CsvHandler.writeToCsv("tan", x, result);
        return result;
    }
}
