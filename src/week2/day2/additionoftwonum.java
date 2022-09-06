package week2.day2;

import java.util.Scanner;

public class additionoftwonum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = in.nextInt();

        System.out.print("Total is " + (num1 + num2));
    }
}
