package week2.day2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int output = 1;
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number : ");
        int num = in.nextInt();

        while(num > 0){
            output *= num;
            num -= 1;
        }

        System.out.println("Factorial of the given number : " + output);
    }
}
