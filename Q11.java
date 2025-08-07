package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Q11. Write a program that takes a number from the user and prints the factorial of that number using do-while loop.
        // If the user enters a -ve number then print the message - "bhai, kya kar raha hai?".
        // Keep doing it until the user enters a +ve number.

        //Approach-1
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        int fact=1;
        while (n<0){
            System.out.println("bhai, kya kar raha hai?");
            n=sc.nextInt();
        }
        int i=n;
        while (i>=1){
            fact=fact*i;
            i--;
        }
        System.out.println("factorial= "+fact);
         */

        //Approach-2
        /*int n;
        int fact=1;
        do{
            System.out.println("enter the number:");
            n=sc.nextInt();
            if(n<0){
                System.out.println("bhai, kya kar raha hai?");
            }else{
                int i=n;
                while (i>=1){
                    fact=fact*i;
                    i--;
                }
                System.out.println("factorial= "+fact);
            }
        }while(n<0);
         */
    }
}
