package com.java;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;



public class FileHandling {

    public static void main(String[] args) {



        // Code to create a new file

        /*

        File Myfile = new File("File_Handling");

        try {

            Myfile.createNewFile();

            System.out.println("File created successfully");

        }

        catch (IOException e){

            e.printStackTrace();

        }



        // Code to write to a file

        FileWriter filewriter = null;

        try {

            filewriter = new FileWriter("File_Handling");

            filewriter.write("This frst file created by Musharraf\n Okay that's great Mush");

            filewriter.close();

        } catch (IOException e) {

            throw new RuntimeException(e);

        }



        // Reading a file

        File Myfile = new File("File_Handling");

        try {

            Scanner sc = new Scanner(Myfile);

            while(sc.hasNextLine()){

                String line = sc.nextLine();

                System.out.println(line);

            }

            sc.close();

        }

        catch (FileNotFoundException e){

            e.printStackTrace();

        }

         */



        // Deleting a file

        File myFile = new File("cwh111file.txt");

        if(myFile.delete()){

            System.out.println("I have deleted: " + myFile.getName());

        }

        else{

            System.out.println("Some problem occurred while deleting the file");

        }

    }

}