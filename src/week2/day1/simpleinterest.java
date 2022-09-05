package week2.day1;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal : ");
        int principal = input.nextInt();
        System.out.print("Enter no of years : ");
        int time = input.nextInt();
        System.out.print("Enter rate of interest : ");
        int rate = input.nextInt();

        int result = principal * time * rate / 100 ;

        System.out.println("Your simple interest is : " + result);
    }
}
