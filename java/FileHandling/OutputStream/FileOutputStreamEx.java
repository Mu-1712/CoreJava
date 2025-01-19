package com.java.FileHandling.OutputStream;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
    public static void main(String[] args) {

        // Java FileOutputStream example 2: write Int
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\DELL\\Documents\\CodeArea\\" +
                            "CoreJava\\src\\com\\java\\FileHandling\\OutputStream\\fileoutputstream.txt");
            fout.write(65);
            fout.close();
            System.out.println("File created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Java FileOutputStream example 2: write string
        try {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\DELL\\Documents\\CodeArea\\CoreJava" +
                               "\\src\\com\\java\\FileHandling\\OutputStream\\fileoutputstreamUsingStrings.txt");
            String str = "FileOutputStream is used to write data";
            byte[] b = str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("StringFile created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}