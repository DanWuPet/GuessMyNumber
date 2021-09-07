package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int guess;
        Random rnd = new Random();
        int number = rnd.nextInt(100) + 1;

        System.out.println("I'm thinking of a number between 1 and 100\n(Including both)." +
                " Can you guess what it is?");

        System.out.print("Type a number: ");
        Scanner in = new Scanner(System.in);
        guess = in.nextInt();
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        if (guess < number){
            int delta = number - guess;
            System.out.println("You were off by: " + delta);
        }
        else{
            int delta = guess - number;
            System.out.println("You were off by: " + delta);
        }
    }
}
