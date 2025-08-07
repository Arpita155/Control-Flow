package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q7 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        //Q.7  "Write a program that takes 3 numbers from the user. If the first number is greater than the 3rd number, print the addition
        //of the 3 numbers. If the 1st number is equal to the 2nd number, make 1st number equal to 3rd number and print the
        //message ""Kya struggle hai!"". Print the message ""question dhyanse padho""."

        System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter second number:");
        int b=sc.nextInt();
        System.out.println("enter third number:");
        int c=sc.nextInt();
        if(a>c)
        {
            System.out.println("sum of three number= " + (a+b+c));
        }
        if(a==b) {
            a=c;
            System.out.println("kya stuggle hai!");
            System.out.println(c);
        }
        System.out.println("question dhyan se padho");
    }
}
