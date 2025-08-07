package Control_Flow.QuestionsOf_if_else;

public class Q10 {
    public static void main(String [] args) {
        //Q10.write a java program that prints the odd numbers between 9 and 48 using a while loop
        int i = 9;
        while (i <=48) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

}
