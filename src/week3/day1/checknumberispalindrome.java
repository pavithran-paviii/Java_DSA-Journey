package week3.day1;

import java.util.Scanner;

public class checknumberispalindrome {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int temp =num;
        int output = 1;

        while(temp>0){
            System.out.println("temp is " + temp%10);
            output = (temp % 10) * output;
            temp /= 10;
            System.out.println("temp was " + output);
        }

        System.out.print(output);
    }
}
