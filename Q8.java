package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q8 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        //Q8.write a program that takes the age of the user and his nationality. If the age >= 18 and nationality is ""Indian"",
        //print ""you can vote"". If the age is greater than or equal to 18 but nationality is not equal to ""Indian"", print
        //""bhag yaha se, doosre desh mein ja"". If the age is not greater than 18, print ""abhi ghar jaa, bada ho ja, firr aana"""
        System.out.println("enter the age:");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("enter the nationality:");
        String nationality=sc.nextLine();
        if(age>=18){
            if(nationality.equalsIgnoreCase("indian")){
                System.out.println("you can vote");
            }
            else{
                System.out.println("bhag yaha se ");
            }
        }
        else {
            System.out.println("abhi ghar jaa, bada ho ja , fir aana");
        }
    }
}
