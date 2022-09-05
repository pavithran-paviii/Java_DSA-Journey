package week2.day1;

import java.util.Scanner;

public class currencyConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double usdCurrentValue = 79.80;

        System.out.print("Enter rupee : ");
        int rupee = input.nextInt();

        System.out.println(rupee / usdCurrentValue + " is current value conversion");
    }
}
