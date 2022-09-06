package week2.day1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class fibonacciseries {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = input.nextInt();

        int firstFibonacci =1;
        int lastFibonacci = 1;
        int i = 0;

        while(num > lastFibonacci){
            int temp = firstFibonacci;
            firstFibonacci =lastFibonacci;
            lastFibonacci = temp + firstFibonacci;
            if(num > lastFibonacci){
                System.out.print(lastFibonacci + ", ");
            }
            i++;
        }
    }
}
