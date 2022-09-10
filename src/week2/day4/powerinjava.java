package week2.day4;

import java.util.Scanner;

public class powerinjava {
    public static void main(String[] args){
        double output = 1;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a base number : ");
        double num = in.nextInt();

        System.out.print("Enter a power/exponent : ");
        double pow = in.nextInt();

        for(int i=0; i<pow; i++){
            output *= num;
        }

        System.out.println("The power of entered number is : " + output);
    }
}
