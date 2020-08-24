package com.stackroute;
import java.util.Scanner;

public class Greatest {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two numbers");
        num1=s.nextInt();
        num2=s.nextInt();
        if(num1>num2){
            System.out.println(num1+" is greatest number");
        }
        else{
            System.out.println(num2+" is greattest number");
        }

    }
}
/* Algorithm

1.Start
2.Read a, b
3.if(a>b) then
     Display"a is the largest number"
     otherwise
             Display "b is the largest number
4.Stop

 */