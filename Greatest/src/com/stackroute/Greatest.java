package com.stackroute;

import java.util.Scanner;
/*
 *This class contains a method to find greatest number 
 */
public class Greatest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberOne, numberTwo;
        System.out.println("Enter two numbers");
        numberOne = reader.nextInt();
        numberTwo = reader.nextInt();
        if (numberOne > numberTwo) {
            System.out.println(numberOne + " is greatest number");
        } else {
            System.out.println(numberTwo + " is greattest number");
        }

    }
}
/* Algorithm

1.Start
2.Read a, b
3.if(a>b) then
     Display"a is the largest number"
     otherwise
             Display "b is the largest number
4.Stop

 */