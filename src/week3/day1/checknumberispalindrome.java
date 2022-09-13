package week3.day1;

import java.util.Scanner;

public class checknumberispalindrome {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int temp =num;
        int output = 0;

        while(temp>0){
            output =( output*10) + (temp%10);
            temp /= 10;
        }

        if(output == num){
            System.out.print(output + " is palindrome");
        }else{
            System.out.print(output + " is not a palindrome");
        }
    }
}
