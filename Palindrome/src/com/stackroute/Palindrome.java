package com.stackroute;

import java.util.Scanner;

public class Palindrome {
    public static int GetInput() {
        int num2;
        Scanner s = new Scanner(System.in);
        return num2 = s.nextInt();

    }

    public static void Positive(int num) {
        if (num > 0) {
            System.out.println("Given number is a positive");
        } else {
            System.out.println("Given number is negative");
        }
    }

    public static void Valid(int num2) {
        if (num2 % 1 == 0) {
            System.out.println("It is a valid");
        } else {
            System.out.println("InvaliD");
        }

    }

    public static int Palindrome(int numThree) {
        int sum = 0, rem, numberTwo;
        numTwo = numThree;
        while (numThree > 0) {
            rem = numThree % 10;
            sum = sum * 10 + rem;
            numThree = numThree / 10;
        }
        return sum;

    }

    public static void Display(int numThree, int sumOne) {
        if (numThree == sumOne) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        Palindrome palindrome = new Palindrome();
        int numberOne, sumOne, number;
        numberOne = GetInput();

        number = numberOne;
        palindrome.Positive(number);
        palindrome.Valid(number);
        sumOne = palindrome.Palindrome(number);
        palindrome.Display(number, sumOne);


    }
}
