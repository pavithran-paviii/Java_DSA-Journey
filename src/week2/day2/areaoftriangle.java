package week2.day2;

import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base of triangle : ");
        int base = in.nextInt();
        System.out.print("Enter height of triangle : ");
        int height = in.nextInt();

        System.out.println("The area of triangle is " + base * height / 2);
        in.close();
    }
}
