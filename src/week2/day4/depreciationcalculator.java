package week2.day4;

import java.util.Scanner;

public class depreciationcalculator {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your original value of product : ");
        int productValue = in.nextInt();

        System.out.print("Enter the years of use : ");
        int years = in.nextInt();

        System.out.print("Enter the product salvage value/value while selling : ");
        int salvageValue = in.nextInt();

        /*
         depreciation formula for year -> (productValue - salvageValue) / years
         depreciation value for month ->  depreciation formula for year / 12
         */

        System.out.println("The total depreciation value is " + (productValue - salvageValue) / years);
        System.out.println("The monthly depreciation value is " + ((productValue - salvageValue) / years)/12);
    }
}
