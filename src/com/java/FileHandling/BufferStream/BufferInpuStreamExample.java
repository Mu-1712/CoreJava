package com.java.FileHandling.BufferStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInpuStreamExample {
    public static void main(String[] args){

        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\DELL\\Documents\\CodeArea\\" +
                    "CoreJava\\src\\com\\java\\FileHandling\\BufferStream\\BufferInputStreamfile.txt");

            BufferedInputStream bin = new BufferedInputStream(fin);

            int i;
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }catch (Exception e){System.out.println(e);}
    }
    }
