package org.example;

public class Main {
    public static void main(String[] args) {
        FunctionSystem functionSystem = new FunctionSystem();
        System.out.println(functionSystem.calculate((Double) null, 0.001));
    }
}