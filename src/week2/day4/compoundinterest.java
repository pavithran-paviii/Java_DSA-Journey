package week2.day4;

import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args){
        /*
            Formula/method to calculate compound interest ->

            = [P (1 + i)n] – P
            = P [(1 + i)n – 1]

            = principal * ((1 + i )^n - 1 )

            Where:

            P = principal
            i = nominal annual interest rate in percentage terms -> (annual interest / 100 )
            n = number of compounding periods
            Take a three-year loan of $10,000 at an interest rate of 5% that compounds annually. What would be the amount of interest? In this case, it would be:

            $10,000 [(1 + 0.05)3 – 1] -> $10,000 [1.157625 – 1] -> $1,576.25
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal : ");
        int principal = in.nextInt();
        System.out.print("Enter the interest : ");
        double interest = in.nextInt();
        System.out.print("Enter the compounting period : ");
        int compountingperiod = in.nextInt();
        double val = Math.pow((1 + (interest / 100)),compountingperiod);
        System.out.println("The value is " + val);
        double output = principal * (val - 1);
        System.out.println("The compount interest is " + output);
    }
}
