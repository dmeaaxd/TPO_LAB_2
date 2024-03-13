package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CsvHandler {

    private static FileWriter writer;

    public static void openFile(String csvFile) throws IOException {
        writer = new FileWriter(csvFile, false); // Открытие файла для перезаписи
    }

    public static void writeToCsv(String func, double X, double res) throws IOException {
        if (writer == null) {
            System.out.println("Файл не открыт");
        }
        writer.append(func + "," + X + "," + res + "\n");
    }

    public static String[] readCsv(String csvFile) throws IOException {
        List<String> lines = new ArrayList<>(); // Создаем список для хранения строк из файла

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line); // Добавляем каждую строку из файла в список
            }
        }

        return lines.toArray(new String[0]); // Преобразуем список в массив строк и возвращаем его
    }

    public static void closeAndSave() throws IOException {
        if (writer != null) {
            writer.flush();
            writer.close();
        }
    }

}
