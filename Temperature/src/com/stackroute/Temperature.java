package com.stackroute;
import java.util.Scanner;
/*
 *This class method contains conversion of temperature from celsius to fahrenheit
 */
public class Temperature {

    public static void main(String[] args) {
        float fahrenheit, celsius = 10;
        int number_of_refactors;
        System.out.println("Enter number of records");
        Scanner reader = new Scanner(System.in);
        number_of_refactors = reader.nextInt();
        System.out.println("S.No" + "     " + "Temperature(Celsius)" + "     " + "Temperature(Fahrenheit)");
        for (int i = 1; i <= number_of_refactors; i++) {
            fahrenheit = (((celsius * 9) / 5)) + 32;
            System.out.println(i + "           " + celsius + "                    " + fahrenheit);
            celsius = celsius + 10;
        }

    }
}
