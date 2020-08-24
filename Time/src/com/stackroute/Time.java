package com.stackroute;
import java.util.Scanner;

public class Time  {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int distance,speed;
        float time;
        System.out.println("Enter distance and speed");
        distance=s.nextInt();
        speed=s.nextInt();
        time=distance/speed;
        System.out.println("Time is "+time);

    }
}
/*
1.Read distance and speed
2.Calculate the time by dividing distance with speed
3.Display time
 */