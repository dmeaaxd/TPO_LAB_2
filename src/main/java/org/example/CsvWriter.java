package org.example;


import java.io.FileWriter;
import java.io.IOException;


public class CsvWriter {
    public static void writeToCsv(String func, double X, double res) {
        String csvFile = "logs.csv";
        try {
            FileWriter writer = new FileWriter(csvFile, true);
            writer.append(func + "," + X + "," + res + "\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
