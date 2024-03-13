package org.example;

public class FunctionSystem {
    private final double e = 2.718281828459045235;  // Число эйлера

    public double calculate(double x, double precision){
        TrigonometricFunctions tf = new TrigonometricFunctions(precision);
        LogarithmicFunctions lf = new LogarithmicFunctions(precision);

        if (x <= 0){
            return Math.pow((tf.cot(x) / tf.tan(x)), 2);
        }
        else{
            double first = Math.pow(Math.pow(lf.log(5, x), 2) / lf.log(3, x), 3)
                    / (lf.log(10, x) * lf.log(e, x) * lf.log(10, x));
            double second = Math.pow(Math.pow(lf.log(10, x), 3) * lf.log(10, x), 2) + (lf.log(10, x) * lf.log(3, x));
            return first * second;
        }
    }
}
