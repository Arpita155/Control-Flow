package Control_Flow.QuestionsOf_if_else;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // Q3. Write a program to take 2 integer values ( years and months ) for age of a person and calculate how many days he has lived.
        // Use 365 days for each year and 30 days for each month. Print the age in number of days.

        System.out.println("enter the year:");
        int years=sc.nextInt();
        System.out.println("enter the months:");
        int months=sc.nextInt();
        System.out.println("total days= "+(years*365 + months*30));
    }
}
