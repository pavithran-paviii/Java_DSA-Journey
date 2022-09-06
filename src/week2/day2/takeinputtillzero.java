package week2.day2;

import java.util.Scanner;

public class takeinputtillzero {
    public static void main(String[] args){
        int output = 0;
        Scanner in =new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = in.nextInt();

        while(num != 0){
            output =output + num;
            System.out.print("Enter a number : ");
            num =in.nextInt();
        }

        System.out.print(output + " is output");
    }
}
