package com.java.Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class PropetiesEx {
    public static void main(String  args[]) throws Exception{

        Properties properties = new Properties();

        // Load properties from a file
        try (FileInputStream input = new FileInputStream("config.properties")){
                properties.load(input);
        }catch (Exception e){
            e.printStackTrace();
        }

        // Accessing properties
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("Username: " +username);
        System.out.println("Password: " +password);

        // Modifying properties
        properties.setProperty("username", "newUser");

        //  // Save properties to a file
        try (FileOutputStream output = new FileOutputStream("config.+properties")){
            properties.store(output, "Updated properties");
        }catch (Exception e){
            e.printStackTrace();
        }

        //Example of Properties class to create the properties file
        System.out.println("Example of Properties class to create the properties file");
        Properties p=new Properties();
        p.setProperty("name","Sunny");
        p.setProperty("email","sunny342@gmail.com");

        p.store(new FileWriter("info.properties"),"Properties Example");
    }
}
