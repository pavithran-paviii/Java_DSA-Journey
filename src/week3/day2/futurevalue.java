package week3.day2;

import java.util.Scanner;

public class futurevalue {
    public static void main(String[] args){

        Scanner in =new Scanner(System.in);

        System.out.print("Enter the principal amount : ");
        double principal = in.nextInt();

        System.out.print("Enter the interest : ");
        double interest = in.nextInt();

        System.out.print("Enter the period in years : ");
        double years = in.nextInt();

        double output = principal * Math.pow(1 + (interest/100),years);

        System.out.println("The future value is : " + output);
    }
}
