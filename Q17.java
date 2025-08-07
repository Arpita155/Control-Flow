package Control_Flow.QuestionsOf_if_else;

import java.util.Scanner;

public class Q17 {

    // WAP to count number of even and odd digits in a given number using for loop
    
    public static void approach2(int n){
        String temp=Integer.toString(n);
        int even=0;
        int odd=0;
        for(int i=0;i<temp.length();i++){
            String tempCharacter=String.valueOf(temp.charAt(i));
            if(Integer.parseInt(tempCharacter)%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("total number of odd digits: "+odd+ "\n total number of even digit: "+even);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number:");
        int n=sc.nextInt();
        approach2(n);
    }
}

