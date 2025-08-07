package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        //Q6.Write the program if a number is divisable by 5 then print "the number is divisable by 5".
        // If the number is divisable by 3 but not divisable by 5 then print "the number is divisable by 3" .
        // If the number is divisable by 3 and 5 print "divisable by both". If the number is not divisable by 3 or 5 print "the number is not divisable by 5 or 3".
        System.out.println("enter the number:");
        int a=sc.nextInt();
        if(a%3==0 && a%5==0)
        {
            System.out.println("the number is divisable by 5 and 3");
        } else if (a%3==0 && a%5!=0) {
            System.out.println("the number is divisable by 3");
        } else if (a%5==0){
            System.out.println("the number is divisable by 5");
        } else {
            System.out.println("the number is not divisable by 5 or 3");
        }

    }
}
