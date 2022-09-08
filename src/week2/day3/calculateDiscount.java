package week2.day3;

import java.util.Scanner;

public class calculateDiscount {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter product amount : ");
        int amount = in.nextInt();
        System.out.print("Enter discount percentage : ");
        int discount = in.nextInt();

        int output = (amount * discount) / 100;

        System.out.println("The discount amount is " + output + " rs");
        System.out.println("The actual amount is " + (amount - output) + " rs");
    }
}
