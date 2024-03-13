package org.example;

public class Main {
    public static void main(String[] args) {
        /*LogarithmicFunctions logarithmicFunctions = new LogarithmicFunctions(0.00001);
        System.out.println(logarithmicFunctions.ln(4));*/

        FunctionSystem functionSystem = new FunctionSystem();
        System.out.println(functionSystem.calculate(-2.1, 0.001));
    }


}