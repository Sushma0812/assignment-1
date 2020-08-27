package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method find quotient of two numbers
 */
public class Quotient {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberOne, numberTwo;
        System.out.println("Enter two numbers");
        numberOne = reader.nextInt();
        numberTwo = reader.nextInt();
        System.out.println("Quotient is " + (numberOne / numberTwo));      //calculates quotient of two numbers
    }
}
/*
1.Read 2 numbers
2.Divide number1 with number2
3.Then display the quotient
 */
