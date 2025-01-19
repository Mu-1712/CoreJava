package com.java.FileHandling.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        
        try {
            FileInputStream fins = new FileInputStream("C:\\Users\\DELL\\Documents\\CodeArea\\CoreJava" +
                    "\\src\\com\\java\\FileHandling\\OutputStream\\fileoutputstreamUsingStrings.txt");

//            int i = fins.read();
            int i=0;
            while((i=fins.read())!=-1) {
                System.out.print((char) i);
            }
            fins.close();d
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
