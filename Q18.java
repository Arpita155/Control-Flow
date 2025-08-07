package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q18 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        // prime number from 1 to 50
        System.out.println("enter the lower range:");
        int lower=sc.nextInt();
        System.out.println("enter the upper range:");
        int upper=sc.nextInt();
        for(int i=lower;i<=upper;i++)
        {
            int j,count=0;
            for(j=2;j<i;j++){
                if(i%j==0) {
                    count += 1;
                }
            }
            if(count==0){
                System.out.println(j);
            }
        }

    }


}
