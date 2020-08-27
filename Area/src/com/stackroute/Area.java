package com.stackroute;

import java.util.Scanner;

/*
 *This class contains a method to find area of rectangle and square
 */
public class Area {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length, breadth, area_of_rectangle, area_of_square, side;
        System.out.println("Enter length and breadth");
        length = s.nextInt();
        breadth = s.nextInt();
        area_of_rectangle = length * breadth;              //calculates area of rectangle
        System.out.println("Area of a rectangle is " + area_of_rectangle);
        System.out.println("Enter side of a square");
        side = s.nextInt();
        area_of_square = side * side;                   //calculate area of square
        System.out.println("Area of a square is " + area_of_square);


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