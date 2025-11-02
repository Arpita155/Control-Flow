package Control_Flow;

public class Patterns {
    public static void main(String [] args){

        //-------------------------- PATTERN PRINTING---------------------------

        //Q1.* * * *
        //   * * * *
        //   * * * *
        //   * * * *
        /*for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Q2.*
        //   * *
        //   * * *
        //   * * * *
        /*for(int i=1;i<=4;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Q. *      // This is from GeeksForGeeks
        //   * *
        //   *   *
        //   * * * *
        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){

                if (i==4)
                    System.out.print("* ");
                else if (j==1)
                    System.out.print("* ");
                else if (j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        */

        //Q3.1
        //   1 2
        //   1 2 3
        //   1 2 3 4
        //   1 2 3 4 5
        /*for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        //Q4.1
        //   2 2
        //   3 3 3
        //   4 4 4 4
        /*for(int i=1;i<=4;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }*/

        //Q5.* * * * *
        //   * * * *
        //   * * *
        //   * *
        //   *
        //Approach-1
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        */

        // Approach-2
        /*for(int i=5;i>=1;i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        //Q6.1 2 3 4 5
        //   1 2 3 4
        //   1 2 3
        //   1 2
        //   1
        // Approach-1
        /*for(int i=5;i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

        //Approach-2
        /*System.out.println("enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */

        //Q7.   *
        //     ***
        //    *****
        //   *******
        /*System.out.println("enter the rows :");
        int rows=obj.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<(rows-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(i*2 +1);j++){
                System.out.print("*");
            }
            for(int j=0;j<(rows-i-1);j++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/

        //Q8.*********
        //    *******
        //     *****
        //      ***
        //       *
        /*System.out.println("enter the rows :");
        int rows=obj.nextInt();
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * rows - (i * 2 + 1)); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        */

        //Q9.   *
        //     ***
        //    *****
        //   *******
        //   *******
        //    *****
        //     ***
        //      *
        /*System.out.println("enter the rows :");
        int rows=obj.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<(rows-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(i*2 +1);j++){
                System.out.print("*");
            }
            for(int j=0;j<(rows-i-1);j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * rows - (i * 2 + 1)); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/

      //Q.  *
        //  * *
        //  * * *
        //  * * * *
        //  * * * * *
        //  * * * *
        //  * * *
        //  * *
        //  *
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         */

      //Q10.  1
        //    10
        //    101
        //    1010
        //    10101
        /*for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if (j % 2 == 0) {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }*/

        //Q11. 1
        //     01
        //     101
        //     0101
        //     10101
        /*int p=-1;
        for(int i=0;i<5;i++){
            p=i%2==0?1:0;
            for(int j=0;j<=i;j++) {
                System.out.print(p);
                p=p==1?0:1;
            }
            System.out.println();
        }
        */

        //Q12.1
        //    2 3
        //    4 5 6
        //    7 8 9 10
        //    11 12 13 14 15
        /*int n=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }*/

        //Q13.    1      1
        //        12    21
        //        123  321
        //        12344321
                /*System.out.println("enter the number:");
                int n=sc.nextInt();
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=i;j++){
                            System.out.print(j);
                    }
                    for(int j=0;j<(2*n-2*i);j++){
                        System.out.print(" ");
                    }
                    for(int j=i;j>=1;j--){
                        System.out.print(j);
                    }
                    System.out.println();
                }
                 */

        //Q14.A
        //    A B
        //    A B C
        //    A B C D
        //    A B C D E
        /*for(int i=0;i<5;i++)
        {
            char p='A';
            for(int j=0;j<=i;j++)
            {
                System.out.print(p++ +" ");
            }
            System.out.println();
        }*/

        //Q15.A B C D E
        //    A B C D
        //    A B C
        //    A B
        //    A
        /*for(int i=5;i>=1;i--)
        {
            char p='A';
            for(int j=i;j>=1;j--)
            {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }*/
    }
}


