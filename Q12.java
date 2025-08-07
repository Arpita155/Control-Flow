package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q12 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        //Q12. Write a program that takes a number from the user. If the number is smaller than 43, tell the user to enter a number again.
        // Keep doing it until he enters a number greater than or equal to 43.After getting the appropriate number,
        // find the total number of factors of the input number except itself and print if it is an even number or odd number.


        System.out.println("enter the number:");
        int n=sc.nextInt();
        int count=0;
        while (n<43){
            System.out.println("enter greater number than 43");
            n=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        System.out.println("total factors= "+count);
        if(count%2==0){
            System.out.println("total no. of factors are even");
        }else{
            System.out.println("total no. of factors are odd");
        }

    }
}
