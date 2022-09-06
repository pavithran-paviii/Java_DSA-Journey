package week2.day2;

import java.util.Scanner;

public class takeinputtillzerolargest {
    public static void main(String[] args){
        int largest = 0;

        System.out.print("Enter a number : ");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        while(num != 0){

            if(num > largest){
                largest = num;
            }

            System.out.print("Enter a number : ");
            num =in.nextInt();
        }

        System.out.print("The largest number entered is " + largest);
    }
}
