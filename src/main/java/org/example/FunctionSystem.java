package org.example;

public class FunctionSystem {

    public double calculate(double x, double precision){
        CsvHandler.openFile("logs.csv");

        TrigonometricFunctions tf = new TrigonometricFunctions(precision);
        LogarithmicFunctions lf = new LogarithmicFunctions(precision);

        double result = 0;

        if (x <= 0){
            result = Math.pow((tf.cot(x) / tf.tan(x)), 2);
        }
        else{
            double first = Math.pow(Math.pow(lf.log(5, x), 2) / lf.log(3, x), 3)
                    / (lf.log(10, x) * lf.ln(x) * lf.log(10, x));
            double second = Math.pow(Math.pow(lf.log(10, x), 3) * lf.log(10, x), 2) + (lf.log(10, x) * lf.log(3, x));
            result = first * second;
        }

        CsvHandler.closeAndSave();
        return result;
    }
}
