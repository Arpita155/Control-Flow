package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        //Q1. write a program to take two numbers from user then print the sum ,multiply,subtract,divide and reminder of two numbers.

        System.out.println("enter first number:");
        int a=obj.nextInt();
        System.out.println("enter second number:");
        int b= obj.nextInt();
        int sum=a+b;
        int mult=a*b;
        System.out.println("sum= "+sum);
        System.out.println("mult= "+mult);
        System.out.println("sub= "+(a-b));
        System.out.println("div= "+(a/b));
        System.out.println("reminder= "+(a%b));


    }

}
