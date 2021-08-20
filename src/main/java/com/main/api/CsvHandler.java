package com.main.api;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class CsvHandler {


    public static void main(String[] args) {
        String fileName = "C:\\Users\\mitch\\OneDrive\\Bureaublad\\apimitch\\src\\main\\resources\\countries.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            String[] lineInArray;
            while ((lineInArray = reader.readNext()) != null) {
                System.out.println(lineInArray[0] + lineInArray[1] + lineInArray[2] );
            }
        } catch (CsvValidationException | IOException e) {
            e.printStackTrace();
        }
    }
}
