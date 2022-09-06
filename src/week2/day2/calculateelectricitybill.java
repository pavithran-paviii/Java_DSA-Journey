package week2.day2;

import java.util.Scanner;

public class calculateelectricitybill {
    public static void main(String[] args){
        int unit_cost = 7;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the unit consumed : ");
        double unit = in.nextInt();

        System.out.println("Charge to be paid " + (unit * unit_cost) + " rs");
    }
}
