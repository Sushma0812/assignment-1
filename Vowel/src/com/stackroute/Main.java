package com.stackroute;
import java.util.Scanner;
/*
 *This class contains a method to check  the third character of a string is vowel or not
 */
public class Vowel {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        System.out.println("Enter a name");
        name = reader.nextLine();
        if (name.charAt(2) == 'a' || name.charAt(2) == 'e' || name.charAt(2) == 'i' || name.charAt(2) == 'o' || name.charAt(2) == 'u' || name.charAt(2) == 'A' || name.charAt(2) == 'E' || name.charAt(2) == 'I' || name.charAt(2) == 'O' || name.charAt(2) == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
/*
1.Read a string
2.if the character of the third string is equal to a,e,i.o,u or A.E.I.O.U
    Display it is a vowel
    otherwise
    it is a consonant
 */