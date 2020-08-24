package com.stackroute;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int len,breadth,area1,area2,side;
        System.out.println("Enter length and breadth");
        len=s.nextInt();
        breadth=s.nextInt();
        area1=len*breadth;
        System.out.println("Area of a rectangle is "+area1);
        System.out.println("Enter side of a square");
        side=s.nextInt();
        area2=side*side;
        System.out.println("Area of a square is "+area2);


    }
}
/* Algorithm
1.Read length,breadth
2.Calculate area by mutliplying length and breadth
3.Display area



1.Read side of a square
2 Calculate area by multiplying side with side
3.Display area

 */