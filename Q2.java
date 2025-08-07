package Control_Flow.QuestionsOf_if_else;
import java.util.Scanner;
public class Q2 {
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);

        //Q2. "Write a program which takes number_of_hours and number_of_minutes as input from user and passes it to a function
        //which converts the hours and minutes to seconds."

        System.out.println("enter the hour:");
        int hour=obj.nextInt();
        System.out.println("enter the minute");
        int min=obj.nextInt();
        int sec=(3600*hour)+(60*min);
        System.out.println("total second="+ sec);

    }
}
