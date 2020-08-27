package com.stackroute;
import java.util.Scanner;
/*
 *This class contains method to find sum and average of array elements
 */
public class SumandAverage {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int array[] = new int[5];
        int sum = 0;
        float average
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
            sum = sum + array[i];                //calculates sum of array elements
        }
        System.out.println("Sum is " + sum);
        average = sum / 5;                         //calculates average of array elements
        System.out.println("Average is " + average);

    }
}
/*
1.Read 5 numbers using array
2.calculate sum of the elements
3.Display sum
4.Calculate average by dividing the sum with array length
5.Display average
 */