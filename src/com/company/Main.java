package com.company;

import java.util.Random;

import java.util.Scanner;

public class Main {

    public static int attempts;
    public static int i;

    public static void main(String[] args) {


        attempts = 1;
        int i = 1;

        Random random = new Random();
        int randInt = random.nextInt(20);

        System.out.println("Lets play a game" + "\n");

        while (i >= 1 && i <= 5) {

            Scanner input = new Scanner(System.in);



            System.out.println("Think of a number between 1 and 20");


            int userInput = input.nextInt();
            System.out.println("Your number is " + userInput);


            if (userInput == randInt) {
                System.out.println("You guessed correct, well done!");
                System.exit(0);


            } else if (userInput != randInt) {

                System.out.println("You guessed incorrectly, you have " + (5 - i) + " attempts remaining");

                    if(userInput > randInt){
                        System.out.println("Your number is too large, try again" + "\n");
                    }else if(userInput < randInt){
                        System.out.println("Your number isn't large enough" + "\n");
                    }


            }

            int attempts = (5 - i);
            i++;

            if(attempts == 0){
                System.out.println("Unlucky the number was " + randInt);
            }

        }
    }
}