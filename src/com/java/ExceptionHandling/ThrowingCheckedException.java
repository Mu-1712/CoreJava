package com.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowingCheckedException {
    public static void method() throws FileNotFoundException {
        FileReader file = new FileReader("C:\\Users\\DELL\\Downloads\\ThrowingCheckedException.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // Read file content or throw FileNotFoundException if the file is not found
        try {
            String line;
            while ((line = fileInput.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } finally {
            try {
                fileInput.close();
            } catch (IOException e) {
                System.out.println("Failed to close the BufferedReader: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Rest of the code...");
    }
}
