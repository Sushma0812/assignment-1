package com.stackroute;

import java.util.Scanner;
/*
 *This class contains a method to check number is even r odd
 */

public class Evenorodd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = reader.nextInt();
        if (number % 2 == 0) {                            //checks the number is even or not
            System.out.println("Given number is even");
        } else {
            System.out.println("Given number is odd");
        }
    }
}


/*
1.Read a number
2.If given number is divisible by 2
    Display it is even
    Otherwise
    It is odd
 */
