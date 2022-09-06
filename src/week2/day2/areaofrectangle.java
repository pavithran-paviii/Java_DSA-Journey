package week2.day2;

import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of rectangle : ");
        int length = in.nextInt();
        System.out.print("Enter the width of rectangle : ");
        int width = in.nextInt();

        System.out.println("The area of rectangle is " + length * width);
    }
}
