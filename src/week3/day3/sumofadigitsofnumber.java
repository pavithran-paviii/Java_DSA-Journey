package week3.day3;

import java.util.Scanner;

public class sumofadigitsofnumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int output = 0;

        while(num>0){
            int lastno =num%10;

            output += lastno;

            num /= 10;
        }

        System.out.println("The sum of digits is " + output);
    }
}
