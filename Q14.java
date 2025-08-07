package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q14 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        //Q14. Write a program that takes a number from the user - say 't'.
        // Now, take 't' number of numbers from the user and for each number, check if it is even or odd.

        System.out.println("enter the t number:");
        int t=sc.nextInt();
        int i=0;
        while (i<t){
            System.out.println(" start enter the number:");
            int m=sc.nextInt();
            if(m%2==0){
                System.out.println(m + " is even number");
            }else{
                System.out.println(m + "is odd number");
            }
            i++;
        }

    }
}
