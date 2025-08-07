package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //Q4. Write a program that takes a input from the user and then check if the number is greater than 10, print "I am awesome!".
        // If the number is not greater than 10, print "I am one of a kind!". Regardless of the value, print "Testing your knowledge"

        System.out.println("enter the number:");
        int n=sc.nextInt();
        if (n > 10) {
            System.out.println("I am awesome!");
        } else{
            System.out.println("I am one of a kind!");
        }
            System.out.println("Testing your knowledge");
    }
}
