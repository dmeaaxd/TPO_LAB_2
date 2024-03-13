package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CsvHandler {

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

    public static List<String> readCsv(String csvFile) throws IOException {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            throw new IOException("Ошибка чтения файла: " + e.getMessage());
        }

        return lines;
    }

}
