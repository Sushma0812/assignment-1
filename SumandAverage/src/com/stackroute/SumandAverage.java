package com.stackroute;
import java.util.Scanner;

public class SumandAverage{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr1[]=new int[5];
        int sum=0;
        float avg;
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
            sum=sum+arr1[i];
        }
        System.out.println("Sum is "+sum);
        avg=sum/5;
        System.out.println("Average is "+avg);

    }
}
/*
1.Read % numbers using array
2.calculate sum of the elements
3.Display sum
4.Calculate average by dividing the sum with array length
5.Display average
 */