package com.stackroute;
import java.util.Scanner;
public class Palindrome {
    public static int GetInput() {
        int num2;
        Scanner s=new Scanner(System.in);
        return num2 =s.nextInt();

    }
    public static void Positive(int num){
        if(num>0){
            System.out.println("Given number is a positive");
        }
        else{
            System.out.println("Given number is negative");
        }
    }
    public static void Valid(int num2){
        if(num2%1==0){
            System.out.println("It is a valid");
        }
        else{
            System.out.println("InvaliD");
        }

    }
    public static int Palindrome(int num2){
        int sum=0,rem,num1;
        num1=num2;
        while(num2>0){
            rem=num2%10;
            sum=sum*10+rem;
            num2=num2/10;
        }
        return sum;

    }
    public static void Display(int num2,int sum1){
        if(num2==sum1){
            System.out.println("Given number is palindrome");
        }
        else{
            System.out.println("Given number is not a palindrome");
        }

    }
   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        Palindrome obj=new Palindrome();
        int num,sum1,number;
        num=GetInput();

        number=num;
       obj.Positive(number);
       obj.Valid( number);
        sum1=obj.Palindrome(number);
       obj.Display(number,sum1);


    }
}
