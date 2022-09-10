package week2.day4;

import java.util.Scanner;

public class cgpacalculator {
    public static void main(String[] args){

        double total = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of subjects : ");
        int noofsub = in.nextInt();

        for(int i=1; i<=noofsub; i++){
            System.out.print("Enter subject " + i + " grade : ");
            double mark = in.nextInt();
            total += mark;
        }

        /*
            formula for CGPA -> subjects sum / total no of sub
            formula for percentage -> cgpa * 9.5
         */

        System.out.println("CGPA is " + total / noofsub);
        System.out.println("Percentage is " + (total / noofsub) * 9.5 + " %");
    }
}
