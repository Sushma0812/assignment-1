package com.stackroute;
import java.util.Scanner;
/*
 *This class contatins a method calculate time of the journey
 */
public class Time {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int distance, speed;
        float time;
        System.out.println("Enter distance and speed");
        distance = reader.nextInt();
        speed = reader.nextInt();
        time = distance / speed;               //calculates time
        System.out.println("Time is " + time);

    }
}
/*
1.Read distance and speed
2.Calculate the time by dividing distance with speed
3.Display time
 */