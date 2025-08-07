package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q9 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        //Q9.Write a java program that takes a number as input and displays its multiplication table upto 10.

        System.out.println("enter the number:");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int n=a*i;
            System.out.println(a + "x" + i + "=" +a*i);
        }
    }

}
