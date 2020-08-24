package com.stackroute;
import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two numbers");
        num1=s.nextInt();
        num2=s.nextInt();
        System.out.println("Quotient is "+(num1/num2));
    }
}
/*
1.Read 2 numbers
2.Divide number1 with number2
3.Then display the quotient
 */
