package week2.day4;

import java.util.Scanner;

public class calculatecommission {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount : ");
        double amount = in.nextInt();

        System.out.print("Enter commission percentage : ");
        double commissionperc = in.nextInt();

        /*
         formula is -> amount * commission percentage / 100
         */

        System.out.println("Commission amount is : " + amount * commissionperc / 100);
    }
}
