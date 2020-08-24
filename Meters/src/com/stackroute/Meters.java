package com.stackroute;
import java.util.Scanner;

public class Meters {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float km,m;
        System.out.println("Enter a number in kilometers");
        km=s.nextInt();
        m=km*1000;
        System.out.println("Kilometers to meters is "+m);

    }
}
/*
 1.Read a number in kilometers
 2.Multiply the given number with 1000
 3.Then display result which is in meters
 */