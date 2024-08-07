package com.java.FileHandling.BufferStream;

import java.io.*;

public class BufferOutputStreamExample {
    public static void main(String[] args) throws Exception{

        FileOutputStream fout = new  FileOutputStream("C:\\Users\\DELL\\Documents\\CodeArea\\CoreJava" +
                "\\src\\com\\java\\FileHandling\\OutputStream\\fileoutputstreamUsingStrings.txt");

        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String s = "This is BufferOutputStream";

        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println(" BufferedOutputStream");

    }
}
