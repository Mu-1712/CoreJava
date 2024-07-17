package com.java;

import java.util.Scanner;

import java.util.Random;

class Game {

    public int random;

    public int Userinput;

    public int noofGuesses = 0;



    public int getNoOfGuesses() {

        return noofGuesses;

    }



    public void setNoofGuesses(int noofGuesses) {

        this.noofGuesses = noofGuesses;

    }

    Game(){

        Random rand = new Random();

        // Generate random integers in range 0 to 100

        this.random = rand.nextInt(100);

    }

    void takeUserInput(){

        System.out.print("Guess the random");

        Scanner sc = new Scanner(System.in);

        Userinput = sc.nextInt();

    }

    boolean isCorrectrandom(){

        noofGuesses++;

        if(Userinput==random){

            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", random, noofGuesses);

            return true;

        }

        else if(Userinput<random){

            System.out.println("Too low...");

        }

        else if(Userinput>random){

            System.out.println("Too high...");

        }

        return false;

    }

}



public class GuessNumberOops{

    public static void main(String[] args) {



        Game gamer = new Game();

        boolean b = false;

        while (!b) {

            gamer.takeUserInput();

            b = gamer.isCorrectrandom();



        }



    }

}