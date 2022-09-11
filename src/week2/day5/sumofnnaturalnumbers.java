package week2.day5;

import java.util.Scanner;

public class sumofnnaturalnumbers {
    public static void main(String[] args){
        /*
         Formula for n natural numbers ->  (n*(n+1))/2
         */

        Scanner in =new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();

        System.out.println("Sum of n natural number is " + (num*(num+1))/2);
    }
}
